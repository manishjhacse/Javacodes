public class SudokuProblem {
    public static void print(int grid[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int grid[][],int row,int col,int num,int n)
    {
        for(int i=0;i<n;i++)
        {
            if(grid[row][i]==num)
            return false;
        }
        for(int j=0;j<n;j++)
        {
            if(grid[j][col]==num)
            return false;
        }
        int sqrt=(int)Math.sqrt(n);
        int boxRow=row-row%sqrt;
        int boxCol=col-col%sqrt;
        for(int i=boxRow;i<boxRow+sqrt;i++)
        {
            for(int j=boxCol;j<boxCol+sqrt;j++)
            {
                if(grid[i][j]==num)
                return false;
            }
        }
        return true;
    }
    public static boolean solveSudoku(int grid[][],int n)
    {
        int row=-1,col=-1;
        boolean isEmpty=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==0)
                {
                    row=i;
                    col=j;
                    isEmpty=false;
                    break;
                }
            }
            if(!isEmpty)
            {
                break;
            }
        }
        if(isEmpty)
        {
            return true;
        }
        for(int num=1;num<=9;num++)
        {
           if(isSafe(grid, row, col, num, n)==true)
           {
                grid[row][col] = num;
                if(solveSudoku(grid, n))
                {
                    return true;
                }
                else{
                    grid[row][col]=0;
                }
           }
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]grid={
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
        int n=grid.length;
        if(solveSudoku(grid, n)==true)
        {
            print(grid, n);
        }
        else
        {
            System.out.println("No solution exist for this sudoku.");
        }
    }
}
