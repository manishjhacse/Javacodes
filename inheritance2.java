class human
{
    private String name;
    int age;
    human()
    {
        System.out.println("human class constructor");
    }
    void sleep()
    {
        age=19;
        System.out.println("human needs good sleep");
        System.out.println(age);
    }
    
}
class student extends human
{
    // student()
    // {
    //     super();
    //     this is the default syntax of constructor when we don't define a constructor and super()
    //    method calls the parent constructor so in this program 
    //     "human class constructor" will be displayed
    // }
        //constructor can not inheritance
    void disp()
    {
        System.out.println("The age is: "+age);
        //System.out.println(name); this will throw error as name is private so it can not inherit
    }
}

public class inheritance2 {
    public static void main(String args[])
    {
        student st=new student();
        st.sleep();
        st.disp();
    }
}
