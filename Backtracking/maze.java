import java.util.ArrayList;

public interface maze {
       public static ArrayList<String> mazeWays(String p,int row,int col){
        if(row==1 && col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> right=new ArrayList<>();
        ArrayList<String> down=new ArrayList<>();
        if(row>1){
            down=mazeWays(p+'D', row-1, col);
        }
        if(col>1){
            right=mazeWays(p+'R', row, col-1);
        }
        down.addAll(right);
        return down;
    }
    
    public static void main(String[] args) {
        ArrayList<String> ways=mazeWays("", 3, 3);
        System.out.println(ways);
    }
}
