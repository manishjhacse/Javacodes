class test{
    int a;
    String name;
    public static void main(String args[])
    {
        int num;
        test obj1=new test();
        test obj2=new test();
        obj1.name="manish";
        obj2.a=56;
        num=42;
        System.out.println(obj1.name);
        System.out.println(obj2.name);
        System.out.println(obj1.a);
        System.out.println(obj2.a);
        System.out.println(num);
    }
}