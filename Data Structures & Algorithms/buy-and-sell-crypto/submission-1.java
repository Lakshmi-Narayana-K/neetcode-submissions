class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if(n < 2) return 0;

        int profitMax = 0;
        int minValue = prices[0];

        for(int i = 1; i<n;i++){
            int diff = prices[i] - minValue;
            if(diff > 0){
                profitMax = Math.max(profitMax, diff);
            }
            minValue = Math.min(prices[i], minValue);
        }

        return profitMax;
    }
}
