class student{
    private int age;
    private String name;

  
  

    public int getAge() {
        return age;
    }




    public void setAge(int age) {
        this.age = age;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public void showdata()
    {
        System.out.println("name: "+name+ " age: "+age);
    }
}

public class encap3 {
    public static void main(String args[])
    {
        student obj1=new student();
        student obj2=new student();
        obj1.setAge(19);
        obj2.setAge(20);
        obj1.setName("Manish");
        obj2.setName("Siddhesh");
       int std1=obj1.getAge();
       System.out.println(std1);
       obj1.showdata();
       obj2.showdata();
    }
    
}
