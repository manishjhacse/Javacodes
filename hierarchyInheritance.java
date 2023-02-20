class animal
{
    String go;
    void dis()
    {
        System.out.println(go);
    }   
}
class monkey extends animal
{

}
class dog extends animal
{

}
class tiger extends animal
{

}
public class hierarchyInheritance {
    public static void main(String args[])
    {
        monkey m=new monkey();
        m.go="jump";
        m.dis();
        dog d=new dog();
        d.go="walk";
        d.dis();
        tiger t=new tiger();
        t.go="run";
        t.dis();


    }
}
