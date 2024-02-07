class human
{
    int age;
    String name;
    void dis()
    {
        System.out.println("Name: "+name+" age: "+age);
    }
    
}
class child extends human
{
    void game()
    {
        System.out.println("Children should play outdoor games");
    }
}
class student extends child
{
    void study()
    {
        System.out.println("students should focus on their studies.");
    }
}

public class multiLevelinheritance {
    public static void main(String args[])
    {
        student st=new student();
        st.name="Manish";
        st.age=19;
        st.dis();
        st.game();
        st.study();

    }
    
}
