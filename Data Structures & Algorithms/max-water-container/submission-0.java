class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;
        int n = heights.length;
        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                int volume = (j-i)*(Math.min(heights[i], heights[j]));
                maxVolume = Math.max(maxVolume , volume);
            }
        };

        return maxVolume;
    }
}
