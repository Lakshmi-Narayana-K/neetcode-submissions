class Solution:
    def climbStairs(self, n: int) -> int:
      array = [-1] * (n + 1);
      return self.recursion(n, array)

    def recursion( self, n, array ):
        if(array[n] != -1):
            return array[n];
        if n < 0:
            return 0;
        if n == 0:
            return 1;
        
        left = self.recursion(n-1, array)
        right = self.recursion(n-2, array)
        sum = left+right
        array[n] = sum;
        return sum