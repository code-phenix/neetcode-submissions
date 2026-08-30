class Solution {

    //[3,4,5,6,1,2]

    // left=0 , right =5 , mid = 2 
    
    // left=3 , right =5 , mid= 4

    // left = 4 , right = 4 , mid 

    public int findMin(int[] nums) {
       int left =0 , right =nums.length-1 , mid =0;

       while(left<right){
            mid =left + (right-left) / 2;

            if(nums[mid] > nums[right]){
                left = mid+1;
            }
            else
                right=mid;
       }
       return nums[left];
    }
}
