class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] freq = new ArrayList[nums.length + 1];  // Max frequency can be nums.length
        int[] result = new int[k];

        // Initialize the frequency array
        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        // Build the frequency map
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Bucket sort: Place numbers in the corresponding frequency list
        for (int key : map.keySet()) {
            int count = map.get(key);
            freq[count].add(key);
        }

        // Collect the top k frequent elements
        int idx = 0;
        for (int i = freq.length - 1; i > 0 && idx < k; i--) {
            for (int num : freq[i]) {
                if (idx < k) {
                    result[idx++] = num;
                } else {
                    break;
                }
            }
        }

        return result;
    }
}
