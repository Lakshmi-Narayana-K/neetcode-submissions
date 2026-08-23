class Solution:
    def rob(self, nums: List[int]) -> int:
        size = len(nums)
        arr = [-1] * (size + 1)
        return self.dfs(nums, size, 0, arr)


    def dfs(self, nums, size, i, arr):
        if i>=size:
            return 0

        if arr[i] != -1:
            return arr[i]

        arr[i] =  max(nums[i] + self.dfs(nums, size, i+2, arr), self.dfs(nums, size, i+1, arr))

        return arr[i]