class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap hs=new HashMap<Integer,Integer>();
        for(int iterI=0;iterI<nums.length;iterI++){
            if(!hs.containsKey(nums[iterI])){
                hs.put(nums[iterI],iterI);
            }
            if(hs.containsKey((target-nums[iterI])) && (int)hs.get((target-nums[iterI]))!=iterI)
                return new int[]{ (int)hs.get(target-nums[iterI]),iterI};
        }
        return new int[2];
    }
}
