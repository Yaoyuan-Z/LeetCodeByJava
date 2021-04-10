class Solution {
    public int maxProfit(int[] prices) {
        int minprice = 10001;
        int result =0;
        for(int i =0; i<prices.length;i++){
            if(prices[i]<minprice){
                minprice = prices[i];
            }else{
                if(prices[i]-minprice>result){
                    result = prices[i]-minprice;
                }
            }
        }
        return result;
        
    }
}
