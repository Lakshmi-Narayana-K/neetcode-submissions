class Solution {
    public int trap(int[] height) {
        // Brute Force
        if (height.length < 3) return 0;

        int n = height.length;
        int totalVolume = 0;

        for (int i = 1; i < n - 1; i++) {
            int leftMax = findLeftMax(i, height);
            int rightMax = findRightMax(i, height);

            int volumeAtIndex = Math.min(leftMax, rightMax) - height[i];
            if (volumeAtIndex > 0) {
                totalVolume += volumeAtIndex;
            }
        }

        return totalVolume;
    }

    private int findLeftMax(int index, int[] height) {
        int max = 0;
        for (int i = 0; i <= index; i++) { 
            max = Math.max(max, height[i]);
        }
        return max;
    }

    private int findRightMax(int index, int[] height) {
        int max = 0;
        for (int i = index; i < height.length; i++) {
            max = Math.max(max, height[i]);
        }
        return max;
    }
}
