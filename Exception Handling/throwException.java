public class throwException {
    public static void main(String[] args) {
        int num1=8;
        int num2=0;
        try{
            if(num2<0)
            {
                Exception e=new ArithmeticException("Number is negative");
                throw e;
            }
            else
            {
            int result=num1/num2;
            System.out.println(result);
            }
        }
        catch(Exception e)
        {
            System.out.println("Enter a valid number"+e);
        }
        
    }
}
