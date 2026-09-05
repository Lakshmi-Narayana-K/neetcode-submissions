class Solution:
    def combinationSum2(self, nums: List[int], target: int) -> List[List[int]]:
        res = []
        subset = []

        nums.sort()

        def dfs(start, subsetSum):
            if subsetSum == target:
                res.append(subset.copy())
                return

            if subsetSum > target:
                return

            for i in range(start, len(nums)):
                if i > start and nums[i] == nums[i - 1]:
                    continue

                subset.append(nums[i])
                dfs(i + 1, subsetSum + nums[i])
                subset.pop()

        dfs(0, 0)
        return res