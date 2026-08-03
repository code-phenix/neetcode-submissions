class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap hs=new HashMap<Integer,Integer>();
        for(int iterI=0;iterI<nums.length;iterI++){
           int otherNumber=target-nums[iterI];

           if(hs.containsKey(otherNumber))
                return new int[]{(int)hs.get(otherNumber),iterI};
            hs.put(nums[iterI],iterI);
        }
        return new int[2];
    }
}
