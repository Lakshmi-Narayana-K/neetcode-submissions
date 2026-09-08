class Solution:
    def exist(self, board: List[List[str]], word: str) -> bool:
        rows = len(board)
        columns = len(board[0])
        word_len = len(word)

        def find(r, c, word_idx=0):
            if word_idx == word_len:
                return True
            if r < 0 or r == rows or c < 0 or c == columns:
                return False
            v = board[r][c]
            if v != word[word_idx]:
                return False

            board[r][c] = "*"
            found = (
                find(r + 1, c, word_idx + 1)
                or find(r - 1, c, word_idx + 1)
                or find(r, c + 1, word_idx + 1)
                or find(r, c - 1, word_idx + 1)
            )
            board[r][c] = v
            return found

        for i in range(rows):
            for j in range(columns):
                if find(i, j):
                    return True
        return False