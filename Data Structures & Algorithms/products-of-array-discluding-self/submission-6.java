class Solution {
    public int[] productExceptSelf(int[] nums) {
    int res[]=new int[nums.length];
    res[0]=1;
    int sum=1;
    for(int iter=1;iter<nums.length;iter++){
        res[iter] = res[iter-1] * nums[iter-1];
    }

    for(int iter=nums.length-1;iter>=0;iter--){
        res[iter]*= sum;
        sum *=nums[iter];
    }
    return res;
}  
}
