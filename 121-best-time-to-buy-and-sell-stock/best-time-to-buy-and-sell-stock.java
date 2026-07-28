class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit=0;
        int bestBuy=prices[0];

        for(int i=1;i<prices.length;i++){
            if(prices[i]>bestBuy){
                maxprofit=Math.max(maxprofit,prices[i]-bestBuy);
            }
            bestBuy=Math.min(bestBuy,prices[i]);
        }
        return maxprofit;
    }
}