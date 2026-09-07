from typing import List

class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        res = []
        
        def backtrack(open_count: int, close_count: int, current_str: str):
            # Base case: valid string of length 2 * n complete
            if len(current_str) == 2 * n:
                res.append(current_str)
                return
            
            # Can add an opening parenthesis
            if open_count < n:
                backtrack(open_count + 1, close_count, current_str + "(")
                
            # Can add a closing parenthesis only if it won't exceed open ones
            if close_count < open_count:
                backtrack(open_count, close_count + 1, current_str + ")")

        backtrack(0, 0, "")
        return res