class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for(int i = 0; i< n-2; i++){
            for(int j = i+1; j<n-1; j++){
                for(int k = j+1; k < n; k++){

                    if(nums[i] + nums[j]+nums[k] == 0){
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);

                        if(!res.contains(triplet)){
                            res.add(triplet);
                        }
                    }
                }
            }
        }

        return res;
    }
}
