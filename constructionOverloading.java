class student{

    private int age;
    private String name;

    student()
    {
        System.out.println("Default constructor is called");
        age=19;
        name="Manish";
    }
    student(String name)
    {
        this.name=name;
        age=20;

    }
    student(String name,int age)
    {
        this.name=name;
        this.age=age;

    }
    public void display()
    {
     System.out.println("name is: "+name+" age is "+age);   
    }

}


public class constructionOverloading {
    
    public static void main(String args[])
    {
    student st1=new student();
    st1.display();
    student st2=new student("Manish");
    st2.display();
    student st3=new student("Manish jha",19);
    st3.display();
    }
}
