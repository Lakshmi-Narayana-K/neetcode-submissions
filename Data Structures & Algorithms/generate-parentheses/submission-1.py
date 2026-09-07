class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        if n == 1:
            return ["()"]

        perms = self.generateParenthesis(n - 1)
        res = set()

        for p in perms:
            for i in range(len(p) + 1):
                new_p = p[:i] + "()" + p[i:]
                res.add(new_p)

        return list(res)