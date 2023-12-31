import java.util.ArrayList;

public class diceCustomFace {
    public static void diceFace(String ans, int target,int face) {
        if (target == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(ans + i, target - i,face);
        }
    }

    public static ArrayList<String> diceFaceReturn(String ans, int target,int face) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            list.addAll(diceFaceReturn(ans + i, target - i,face));
        }
        return list;
    }

    public static void main(String[] args) {
        diceFace("", 4,5);
        System.out.println();
        ArrayList<String> ans = diceFaceReturn("", 6,12);
        System.out.println(ans);
    }
}

    
