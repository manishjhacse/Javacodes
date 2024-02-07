class A{

    public void show()
    {
        System.out.println("in show");
    }

     class B{
        public void display()
        {
            System.out.println("in display");
        }
    }
    static class C{
        public void print()
        {
            System.out.println("in print");
        }
    }


}
public class InnerClass {
    public static void main(String[] args) {
        A obj=new A();
        obj.show();
        //obj.display() error
        A.B obj1= obj.new B();
        obj1.display();
       // A.C obj2=obj.new C(); error
       A.C obj2=new A.C();
       obj2.print();

 

    }
}
