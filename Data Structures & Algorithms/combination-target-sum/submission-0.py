class Solution:
    def combinationSum(self, nums: List[int], target: int) -> List[List[int]]:
        res = []

        subset = []

        def dfs(i, subsetSum):

            if subsetSum == target:
                res.append(subset.copy())
                return
            if i >= len(nums) or subsetSum > target:
                return
            
            # Take nums[i]
            subset.append(nums[i])
            dfs(i, subsetSum + nums[i])
            subset.pop()

            # Don't take nums[i]
            
            dfs(i + 1, subsetSum)
        
        dfs(0, 0)
        return res