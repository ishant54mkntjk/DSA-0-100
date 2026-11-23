
class Solution {
    public boolean isValidSudoku(char[][] board) {

        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {

                // Skip empty cells
                if (board[i][j] == '.') {
                    continue;
                }

                // Convert character into index 0-8
                int num = board[i][j] - '1';

                // Find 3x3 box index
                int boxIndex = (i / 3) * 3 + (j / 3);

                // Check duplicate
                if (rows[i][num] ||
                    cols[j][num] ||
                    boxes[boxIndex][num]) {

                    return false;
                }

                // Mark number as visited
                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}
