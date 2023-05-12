import java.util.*;

public class N_Queens {
    public static void Print_sol(int[][] board, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int board[][], int row, int col, int n) {
        int i, j;
        for (i = 0; i < col; i++) {
            if (board[row][i] == 1) {
                return false;
            }
        }
        for (i = row, j = col; i >= 0 && j >= 0; i--, j--) {//check upper diagonal in left dirn
            if (board[i][j] == 1)
                return false;
        }
        for (i = row, j = col; i < n && j >= 0; i++, j--) {//check lower diagonal in left dirn
            if (board[i][j] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean solve_nQueen(int board[][], int col, int n) {
        if (col >= n) {//if all queens are placed 
            return true;
        }
        for (int i = 0; i < n; i++) {
            if (isSafe(board, i, col, n) == true) {
                board[i][col] = 1;

                if (solve_nQueen(board, col + 1, n) == true) {
                    return true;
                }
                board[i][col] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for (int[] row : board) {
            Arrays.fill(row, 0);
        }
        if (solve_nQueen(board, 0, n) == true) {
            Print_sol(board, n);
        } else {
            System.out.println("No possible solution exist.");
        }
        sc.close();
    }
}
