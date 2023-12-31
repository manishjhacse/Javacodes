import java.util.ArrayList;

public class targetDice {
    public static void dice(String ans, int target) {
        if (target == 0) {
            System.out.print(ans + " ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(ans + i, target - i);
        }
    }

    public static ArrayList<String> diceReturn(String ans, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            list.addAll(diceReturn(ans + i, target - i));
        }
        return list;
    }

    public static void main(String[] args) {
        dice("", 4);
        System.out.println();
        ArrayList<String> ans = diceReturn("", 12);
        System.out.println(ans);
    }
}
