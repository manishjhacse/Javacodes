// final class animal
// {
//     void sleep()
//     {
//         System.out.println("Animal is sleeping");
//     }
// }
//a final class can not be used as a parent class
class animal
{
   final int sleep=8;
   final void sleep()
    {
       //sleep=11;
        System.out.println("Animal is sleeping");
    }
}
class tiger extends animal{
    //void sleep() this will give error as a final method can be modified(not override in child class)
    
}
public class finalKeyword {
    public static void main(String args[])
    {
        tiger t=new tiger();
        t.sleep();
    }
}
