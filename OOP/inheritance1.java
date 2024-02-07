class human//super class/base class/parent class
{
    int age;
    void sleep()
    {
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
}
class student extends human//child class/sub class/derived class
{

}

public class inheritance1 {
    public static void main(String args[])
    {
        student st=new student();
        st.age=19;
        st.sleep();

    }
    
}
