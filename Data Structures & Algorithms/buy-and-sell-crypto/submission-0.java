class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;

        if(n < 2) return 0;

        int profitMax = 0;

        for(int i =0; i<n-1; i++){
            for(int j = i+1;j<n;j++){
                int diff = prices[j] - prices[i];
                profitMax = Math.max(profitMax, diff);
            }
        }

        return profitMax;
    }
}
