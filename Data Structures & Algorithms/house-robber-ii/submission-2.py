class Solution:
    def rob(self, nums: List[int]) -> int:
        size = len(nums)
        if size == 1:
            return nums[0]
        if size == 2:
            return max(nums[0], nums[1])
        arrA = nums[0:size-1]
        arrB = nums[1:size]

        arr = [-1] * (size + 1)
        maxA =  self.dfs(arrA, len(arrA), 0, arr)

        arr = [-1] * (size + 1)
        maxB =  self.dfs(arrB, len(arrB), 0, arr)

        return max(maxA, maxB)

    def dfs(self, nums, size, i, arr):
        if i>=size:
            return 0

        if arr[i] != -1:
            return arr[i]

        arr[i] =  max(nums[i] + self.dfs(nums, size, i+2, arr), self.dfs(nums, size, i+1, arr))

        return arr[i]