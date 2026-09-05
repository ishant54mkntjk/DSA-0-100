class Solution {
    public int maxProfit(int[] prices) {
        // int max =0;
        // for(int i=0;i<prices.length;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         int profit =prices[j]-prices[i];
        //           max =Math.max(max,profit);
        //     }
        // }
        // return max;
         int maxprofit =0;
         int minpurchase =prices[0];
         for(int i=1;i<prices.length;i++){
           int profit =prices[i]-minpurchase;

           maxprofit =Math.max(maxprofit,profit);

           minpurchase =Math.min(minpurchase,prices[i]);
         }
         return maxprofit;
    }
}