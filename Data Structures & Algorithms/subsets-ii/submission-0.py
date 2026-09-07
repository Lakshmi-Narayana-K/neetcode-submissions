class Solution:
    def subsetsWithDup(self, nums: List[int]) -> List[List[int]]:
        res = []
        nums.sort()

        def recursion(i, subset):
            if i == len(nums):
                res.append(subset.copy())
                return
            # include
            subset.append(nums[i])
            recursion(i + 1, subset)
            subset.pop()

            # exclude
            while i + 1 < len(nums) and nums[i] == nums[i + 1]:
                i += 1
            recursion(i + 1, subset)
            
        recursion(0, [])
        return res