class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean rowStatus = true;
        boolean columnStatus = true;
        boolean gridStatus = true;

        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < cols; j++) {
                char ch = board[i][j];
                if (ch != '.' && set.contains(ch)) {
                    rowStatus = false;
                    break;
                } else {
                    set.add(ch);
                }
            }
            if (!rowStatus) break;
        }

        // Check columns
        for (int i = 0; i < cols; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < rows; j++) {
                char ch = board[j][i];
                if (ch != '.' && set.contains(ch)) {
                    columnStatus = false;
                    break;
                } else {
                    set.add(ch);
                }
            }
            if (!columnStatus) break;
        }

        // Check 3x3 grids
        for (int startRow = 0; startRow < rows; startRow += 3) {
            for (int startCol = 0; startCol < cols; startCol += 3) {
                Set<Character> set = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char ch = board[startRow + i][startCol + j];
                        if (ch != '.' && set.contains(ch)) {
                            gridStatus = false;
                            break;
                        } else {
                            set.add(ch);
                        }
                    }
                    if (!gridStatus) break;
                }
                if (!gridStatus) break;
            }
            if (!gridStatus) break;
        }

        return rowStatus && columnStatus && gridStatus;
    }
}
