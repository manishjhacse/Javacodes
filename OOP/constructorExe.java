class demo1{
    int a,b;
    public demo1()
    {
        System.out.println("This is parent class constructor");
    }
    public demo1(int x,int y)
    {
        System.out.println("parametrised parent class constructor");
        a=x;
        b=y;
    }

}
class demo2 extends demo1{
    int m,n;
    public demo2()
    {
        //super();
       // this(15,20);
       super(25,24);
        System.out.println("This is child class constructor");
    }
    public demo2(int x,int y)
    {
        System.out.println("This is parametrised child class constructor");
        m=x;
        n=y;

    }

}
public class constructorExe {
    public static void main(String args[])
    {
        demo2 d=new demo2();
        //demo2 d2=new demo2(14,23);
    }
}
