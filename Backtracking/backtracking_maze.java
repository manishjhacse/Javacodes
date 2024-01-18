import java.util.ArrayList;

public class backtracking_maze {
    public static int noOfWays(boolean maze[][], int r, int c) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            return 1;
        }
        int count = 0;
        if (maze[r][c] == false)
            return count;

        maze[r][c] = false;

        if (r < maze.length - 1)
            count += noOfWays(maze, r + 1, c);
        if (c < maze[0].length - 1)
            count += noOfWays(maze, r, c + 1);
        if (r > 0)
            count += noOfWays(maze, r - 1, c);
        if (c > 0)
            count += noOfWays(maze, r, c - 1);

        // this line is where the function will be over
        // so before function gets removed,also remove the change that were made by
        // function
        maze[r][c] = true;
        return count;
    }

    public static void wayToReach(boolean maze[][], int r, int c, ArrayList<String> list, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            list.add(p);
            return;
        }
        if (maze[r][c] == false)
            return;
        maze[r][c] = false;
        if (r < maze.length - 1)
            wayToReach(maze, r + 1, c, list, p + "D");
        if (c < maze[0].length - 1)
            wayToReach(maze, r, c + 1, list, p + "R");
        if (r > 0)
            wayToReach(maze, r - 1, c, list, p + "U");
        if (c > 0)
            wayToReach(maze, r, c - 1, list, p + "L");
        // this line is where the function will be over
        //  so before function gets removed,also remove the change that were made by
        //  function
        // backtrack to the previous step
        maze[r][c] = true;

    }

    public static ArrayList<String> returnWayToReach(boolean maze[][], int r, int c, String p) {
        if (r == maze.length - 1 && c == maze[0].length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> down = new ArrayList<>();
        ArrayList<String> right = new ArrayList<>();
        ArrayList<String> up = new ArrayList<>();
        ArrayList<String> left = new ArrayList<>();
        if (maze[r][c] == false)
            return down;
        maze[r][c] = false;
        if (r < maze.length - 1)
            down = returnWayToReach(maze, r + 1, c, p + "D");
        if (c < maze[0].length - 1)
            right = returnWayToReach(maze, r, c + 1, p + "R");
        if (r > 0)
            up = returnWayToReach(maze, r - 1, c, p + "U");
        if (c > 0)
            left = returnWayToReach(maze, r, c - 1, p + "L");
        down.addAll(right);
        down.addAll(left);
        down.addAll(up);
        // this line is where the function will be over
        // so before function gets removed,also remove the change that were made by
        // function
        maze[r][c] = true;
        return down;
    }

    public static void main(String[] args) {
        boolean maze[][] = {
                { true, true, true },
                { true, true, false },
                { true, true, true }
        };
        System.out.println("Number of ways to reach the bottom right corner is: " + noOfWays(maze, 0, 0));
        ArrayList<String> ans = new ArrayList<>();
        wayToReach(maze, 0, 0, ans, "");
        System.out.println(ans);
        System.out.println(returnWayToReach(maze, 0, 0, ""));

    }
}
