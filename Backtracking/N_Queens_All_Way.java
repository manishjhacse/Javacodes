import java.util.Scanner;

public class N_Queens_All_Way {
    public static boolean isSafe(boolean board[][], int row, int col) {
        int i, j;
        for (i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            // check upper diagonal in left dirn
            if (board[i][j])
                return false;
        }
        for (i = row, j = col; j < board.length && i >= 0; i--, j++) {
            // check upper diagonal in right dirn
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    public static void display(boolean board[][]) {
        for (boolean row[] : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print("Q ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    public static int Queens_places(boolean board[][], int row) {
        if (row == board.length) {
            System.out.println();
            display(board);
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += Queens_places(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of board: ");
        int n = sc.nextInt();
        boolean board[][] = new boolean[n][n];
        int totalWays = Queens_places(board, 0);
        System.out.println("Total no of ways to place all the Queens are: " + totalWays);
        sc.close();
    }
}
