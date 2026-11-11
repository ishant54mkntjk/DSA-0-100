class Solution {
    public int maxProfit(int[] prices) {
        int n =prices.length;
        int low =prices[0];
        
        int profit =0;

        for(int i=0;i<n;i++){
            low =Math.min(prices[i],low);
            
            profit =Math.max(profit,prices[i]-low);
        }
        return profit;
    }
}