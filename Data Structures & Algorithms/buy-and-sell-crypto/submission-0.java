class Solution {
    public int maxProfit(int[] prices) {
        int res=0;
        int start = 0;
        while(start<prices.length){
            int last=prices.length-1;
            while(last>start){
                res=Math.max(res,prices[last]-prices[start]);
                last--;
            }
            start++;

        }
        return res;
        
    }
}
