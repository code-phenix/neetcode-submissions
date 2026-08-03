class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> hs=new HashMap<>();
        for(char inp:s.toCharArray()){
            int temp=hs.getOrDefault(inp,0);
            temp++;
            hs.put(inp,temp);
        }

        for(char inp:t.toCharArray()){
            if(!hs.containsKey(inp))
                return false;
            int temp=hs.get(inp);
            if(temp==1)
                hs.remove(inp);
            else{
                temp--;
                hs.put(inp,temp);
            }

        }
        return hs.isEmpty();
    }
}
