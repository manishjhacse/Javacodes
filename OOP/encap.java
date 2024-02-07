class student{
    private int age;
    private String name;
    public void setdata()
    {
        age=19;
        name="Manish";
    }
    public void showdata()
    {
        System.out.println("name: "+name+" age: "+age);
    }
}
public class encap {
    public static void main(String args[])
    {
        student obj=new student();
        obj.setdata();
        obj.showdata();

    }
    
}
