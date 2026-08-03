class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int iter: nums){
            int temp=hm.getOrDefault(iter,0);
            temp++;
            hm.put(iter,temp);
        }
        int res[]=new int[k];
        PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>(
            (e1,e2) -> {
                return e1.getValue().compareTo(e2.getValue());
            }
        );

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }

        for(int iter=0;iter<k;iter++){
            res[iter]=pq.poll().getKey();
        }
        return res;
    }
}
