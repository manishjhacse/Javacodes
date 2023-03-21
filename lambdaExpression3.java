interface car{
    void drive(int avg,int ts);
}
public class lambdaExpression3 {
    public static void main(String[] args) {
        car obj=(avg,ts)->System.out.println("driving at average speed of "+avg+" and top speed is "+ts);
        obj.drive(50, 180);
    }
    
}
