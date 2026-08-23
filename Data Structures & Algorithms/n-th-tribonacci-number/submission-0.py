class Solution:
    def tribonacci(self, n: int) -> int:
        if n == 0:
            return 0
        if n == 1 or n == 2:
            return 1
        
        prev0 = 0
        prev1 = 1
        prev2 = 1
        
        for i in range(3, n+1):
            curr = prev0 + prev1 + prev2
            prev0 = prev1
            prev1 = prev2
            prev2 = curr

        return prev2