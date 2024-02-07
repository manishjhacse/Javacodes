interface computer
{
    void compile();
}
class desktop implements computer
{
    public void compile()
    {
        System.out.println("compiling.......,no errors");
    }
}
class laptop implements computer
{
    public void compile()
    {
        System.out.println("compiling.......,no errors");
    }
}
class devloper
{
    public void builApp(computer obj)
    {
        System.out.println("writing codes");
        obj.compile();
    }
}
public class interface1 {
    public static void main(String args[])
    {
        devloper dev=new devloper();
        computer obj=new desktop();
        dev.builApp(obj);
        
    }
}
