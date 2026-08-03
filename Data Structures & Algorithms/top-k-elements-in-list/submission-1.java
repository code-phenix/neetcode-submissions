class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int iter: nums){
            int temp=hm.getOrDefault(iter,0);
            temp++;
            hm.put(iter,temp);
        }
        int res[]=new int[k];
        List<Map.Entry<Integer,Integer>> list =new LinkedList<Map.Entry<Integer,Integer>>(hm.entrySet());

        list.sort((e1,e2) -> {
           return e2.getValue().compareTo(e1.getValue());
        }
        );
        int count=0;
        for(Map.Entry<Integer,Integer> entry : list){
            if(count>=k){
                break;
            }
            res[count]=entry.getKey();
            count++;
        }
        return res;
    }
}
