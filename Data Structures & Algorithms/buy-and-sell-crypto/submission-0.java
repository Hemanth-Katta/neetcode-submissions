class Solution {
    public int maxProfit(int[] prices) {

        int profit = 0;
        int left = 0;
        int minBuy = prices[0];

        for(int r=0; r<prices.length; r++) {
            if(prices[r] < prices[left]) {
                minBuy = prices[r];
                left = r;
            } else {
                profit = Math.max(profit, prices[r] - minBuy);
            }
        }
    
        return profit;
        
    }
}
