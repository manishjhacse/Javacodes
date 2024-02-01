public class SudokuSolver {
    public static boolean isSafe(int[][] board, int row, int col, int num) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num)
                return false;
        }
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num)
                return false;
        }
        int sqrt = (int) Math.sqrt(board.length);
        int boxRow = row - row % sqrt;
        int boxCol = col - col % sqrt;
        for (int i = boxRow; i < boxRow + sqrt; i++) {
            for (int j = boxCol; j < boxCol + sqrt; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }

        return true;
    }

    public static void display(int[][] board) {
        System.out.println("Solved Sudoku is:");
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0) {
                for (int k = 0; k < board.length - 2; k++) {
                    System.out.print("---");
                }
                System.out.println(" ");
            }
            for (int j = 0; j < board.length; j++) {
                if (j % 3 == 0) {
                    System.out.print("|");
                }
                System.out.print(board[i][j] + " ");
                if (j == board.length - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
        }
        for (int k = 0; k < board.length -2; k++) {
            System.out.print("---");
        }
    }

    public static boolean solveSudoku(int[][] board) {
        int row = -1;
        int col = -1;
        boolean sudokuSolved = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) {
                    // if there is zero then sudoku is not solved and we will solve for this place
                    row = i;
                    col = j;
                    sudokuSolved = false;
                    break;
                }
            }
            if (!sudokuSolved) {
                break;
            }
        }
        if (sudokuSolved) {
            // If the Sudoku board is already filled, it means that all cells are filled
            // with numbers then we will return true
            display(board);
            return true;
        }

        for (int i = 0; i <= 9; i++) {
            // try placing numbers from 1-9 at the vacant place
            if (isSafe(board, row, col, i) == true) {
                // if number is safe to place then place the number and check if the sudoku
                // solved
                board[row][col] = i;
                if (solveSudoku(board) == true) {
                    return true;
                } else {
                    // if sudoku is not solved by this no then backtrack and put 0 again
                    board[row][col] = 0;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        int[][] grid = {
               {0,0,6,0,0,2,0,0,0},
               {0,8,0,0,0,0,0,5,2},
               {0,9,0,0,3,0,0,0,0},
               {0,0,0,0,0,0,4,0,0},
               {1,0,4,0,0,0,0,0,6},
               {3,0,0,0,0,9,1,0,0},
               {0,0,0,6,0,0,0,7,0},
               {0,0,0,1,4,3,0,0,0},
               {0,0,0,9,0,0,8,6,0}
        };
        if (solveSudoku(grid) == false) {
            System.out.println("No solution exist for this sudoku.");
        }

    }
}
