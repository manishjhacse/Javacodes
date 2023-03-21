interface car{
    void drive();
}
public class AnnonymousInnerClass {
    public static void main(String[] args) {
        
        //car obj=new car(); this will give error as we can not create object of interface
        car obj=new car()
        {//this is not a class of car interface it is a annonymous class
           public void drive()
            {
                System.out.println("Driving......");
            }

        };
        obj.drive();

    }
}
