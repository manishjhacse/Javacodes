class singleClass{
    //this class will be have only one object as the constructor is private other class can not create a instance of this class. get instance is static method which will create instanc once and return the same instance as many time as it is called
    String name;
    private singleClass(){};
    static singleClass instance;
    static singleClass getInstance(){
        if(instance==null){
            instance=new singleClass();
        }
        return instance;
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        singleClass obj1=singleClass.getInstance();
        singleClass obj2=singleClass.getInstance();
        obj1.name="Manish";
        System.out.println(obj1.name);
        obj2.name="Manish Jha";
        // as the obj1 and obj2 are getting the same inctance so change in any one will be change the both
        System.out.println(obj2.name);
        System.out.println(obj1.name);
    }
}
