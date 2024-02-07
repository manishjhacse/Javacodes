import java.util.Scanner;
class student{
    private int age;
    private String name;
    student(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void showdata()
    {
        System.out.println("name: "+name+ " age: "+age);
    }
}

public class constructor {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name and age of studen 2");
        student st=new student("Manish jha", 19);
        student st2=new student(scan.next(),scan.nextInt());
        st.showdata();
        st2.showdata();
        scan.close();
        scan.close();

    }
    
}
