class Solution {

    public boolean binarySearch(int nums[],int key ,int start){

        int end=nums.length-1;
        while(start<=end){
            int mid = start + (end - start) / 2 ;
            if(nums[mid]==key)
                return true;
            else if(key < nums[mid]){
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return false;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res=new ArrayList<>();
        for(int iter=0;iter<nums.length;iter++){
            if ( iter > 0 && nums[iter] == nums[iter - 1]) 
                continue;
            for(int iterI=iter+1;iterI<nums.length;iterI++){
                if (iterI > iter + 1 && nums[iterI] == nums[iterI - 1])
                    continue;
                int val=0-(nums[iter]+nums[iterI]);
                if(binarySearch(nums,val,iterI+1))
                    res.add(new ArrayList<Integer>(Arrays.asList(nums[iter],nums[iterI],val)));
            }
        }
        return res;
    }
}
