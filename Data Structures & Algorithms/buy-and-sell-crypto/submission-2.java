class Solution {
    // [10,1,5,6,7,1]
    //      i,
    //      6
    

    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPrice=Integer.MAX_VALUE;
        for(int price:prices){
            if(price < minPrice)
                minPrice=price;
            else{
                maxProfit = Math.max(maxProfit,(price-minPrice));
            }
        }
        return maxProfit;
       
        
    }
}
