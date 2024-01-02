import java.util.ArrayList;
public class nNoOfdice {
    public static int diceReturn(String ans, int target,int face,int n) {
       if(face*n<target)
       return 0;
       if(target==0 && ans.length()<=n)
       return 1;
       int count=0;
       for(int i=1;i<=face;i++){
        if(target<i)
        break;
        count+=diceReturn(ans+1, target-i, face, n);
       }
       return count;
    }

    public static void main(String[] args) {
       System.out.println(diceReturn("", 4, 6, 4));
    }
}

