class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;
        if(n < 2) return n;
        //Brute Force
        Arrays.sort(nums);
        int maxLen = Integer.MIN_VALUE;

        for(int i =0; i< n; i++){
            int count = 0;
            int indexToCompare = i;
            for(int j = i+1; j < n; j++){
                if(nums[j] == nums[indexToCompare] + 1){
                    count++;
                    indexToCompare = j;
                }
            }

            maxLen = Math.max(maxLen, count + 1);
        }

        return maxLen;
    }
}
