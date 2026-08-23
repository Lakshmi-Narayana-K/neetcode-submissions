class Solution:
    def minCostClimbingStairs(self, cost: List[int]) -> int:
        n = len(cost)
        arr = [-1] * (n+1)

        return min(self.recursion(0, cost, arr), self.recursion(1, cost, arr))

    def recursion(self, i, cost, arr):

        if i >= len(cost):
            return 0

        if arr[i] != -1:
            return arr[i]
        
        option_1 = self.recursion(i+1, cost, arr)
        option_2 = self.recursion(i+2, cost, arr)

        total = cost[i] + min(option_1, option_2)
        arr[i] = total
        return total