public class multipleCatch {
    public static void main(String[] args) {
        int num1=12;
        int num2=4;
        int result=0;
        int value[]={4,5,2,0};
        String name=null;
        try
        {
            result=num1/num2;
            System.out.println(value[5]);
            result=num1/name.length();
        }
        catch(ArithmeticException e)
        {
            System.out.println("A number can not be divided by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("element trying to print is out of the boundry");
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.....");
        }
        System.out.println(result);
    }
}
