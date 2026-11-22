class Solution {
    public boolean isValidSudoku(char[][] board) {
        // Track digits 1-9 (indices 0-8) for each of the 9 rows, columns, and 3x3 boxes
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Skip empty cells
                if (board[i][j] == '.') {
                    continue;
                }

                // Convert char '1'-'9' to index 0-8
                int num = board[i][j] - '1';
                
                // Calculate 3x3 box index (0 to 8)
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check if number already exists in current row, column, or 3x3 box
                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                // Mark number as seen
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}