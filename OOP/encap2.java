class student{
    private int age;
    private String name;

    public void setAge(int age)
    {
        this.age=age;
    }
    public void setName(String name)
    {
        //name=name in this compiler will give priority to local variable 
        this.name=name;//this refers to current object
    }
    public void showdata()
    {
        System.out.println("name: "+name+ " age: "+age);
    }
}

public class encap2 {
    public static void main(String args[])
    {
        student obj1=new student();
        student obj2=new student();
        obj1.setAge(19);
        obj2.setAge(20);
        obj1.setName("Manish");
        obj2.setName("Siddhesh");
        obj1.showdata();
        obj2.showdata();
    }
    
}
