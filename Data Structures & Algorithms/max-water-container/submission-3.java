class Solution {
    public int maxArea(int[] heights) {
        int maxVolume = 0;
        int start = 0;
        int end = heights.length - 1;

        while (start < end) {
            // Calculate the volume for the current pair of indices
            int volume = (end - start) * Math.min(heights[start], heights[end]);
            maxVolume = Math.max(maxVolume, volume);

            // Move the pointer with the smaller height
            if (heights[start] < heights[end]) {
                start++;
            } else {
                end--;
            }
        }

        return maxVolume;
    }
}
