class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n < 2) return n;

        Arrays.sort(nums);

        int maxLen = 0;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                maxLen = Math.max(maxLen, count + 1);
                count = 0;
            }
        }

        maxLen = Math.max(maxLen, count + 1);

        return maxLen;
    }
}
