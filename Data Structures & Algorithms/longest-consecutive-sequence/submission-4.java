class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs =new HashSet<>();
        for(int iter:nums){
            hs.add(iter);
        }
        if(hs.size()<=0)
            return 0;
        if(hs.size()==1){
            return 1;
        }
        int res=0;
        int size=hs.size();
        for(int iter:nums){
            boolean hasPrev=hs.contains(iter-1);
            if(!hasPrev){
                int count=0;
                int val=iter;
                while(hs.contains(val)){
                    count++;
                    val++;
                }
                if(count>res){
                    res=count;
                }
            }
        }
        return res;
    }
}
