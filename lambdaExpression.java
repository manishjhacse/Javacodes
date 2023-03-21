interface car{
    void drive();
}
public class lambdaExpression {
    public static void main(String[] args) {

        /*
         syntax of lambda expression
         (p1,p2)->{
            body of expression
         }
         */



        car obj=()->System.out.println("Driving....");//lambda expression syntax for  no argument
        obj.drive();


    }
}
