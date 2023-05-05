import java.util.*;

public class powerOptimized {
    public static int power_of_n(int a, int b) {
        int res = 0, finalres = 0;
        int mid = 0;
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        } else {
            mid = b / 2;
            res = power_of_n(a, mid);
            finalres = res * res;
            if (b % 2 == 0) {
                return finalres;
            } else {
                return a * finalres;
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number and it's power: ");
        int n = sc.nextInt();
        int a = sc.nextInt();
        int power = power_of_n(n, a);
        System.out.println("result: " + power);
        sc.close();
    }
}