class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> result=new HashMap<>();

        for(String inp:strs){
            int count[]=new int[26];

            for(char in:inp.toCharArray()){
                count[in-'a']++;
            }
            String countArray=Arrays.toString(count);
            if(result.containsKey(countArray)){
                List<String> val=result.get(countArray);
                val.add(inp);
                result.put(countArray,val);
            }
            else{
                List<String> val=new ArrayList<>();
                val.add(inp);
                result.put(countArray,val);
            }

        }
        return new ArrayList<>(result.values());
        
    }
}
