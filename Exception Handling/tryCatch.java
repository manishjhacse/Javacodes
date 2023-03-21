public class tryCatch {
    public static void main(String[] args) {
        int num1=8;
        int num2=4;
        int result=0;
        try{
            result=num1/num2;
        }
        catch(Exception e)
        {
            System.out.println("something went wrong");
        }
        System.out.println(result);
        
    }
}
