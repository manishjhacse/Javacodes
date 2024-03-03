abstract class Parent {
    int age;

    Parent(int age) {
        this.age = age;
    }

    abstract void career();

    abstract void partner();

    static void staticMethod() {
        System.out.println("This is a Static method");
    }
}

class Son extends Parent {

    Son(int age) {
        super(age);
    }

    void career() {
        System.out.println("I will be an engineer");
    }

    void partner() {
        System.out.println("I love xyz");
    }
    // void staticMethod(){
    // System.out.println("This is a Static method in son");
    // }
}

class Daughter extends Parent {
    Daughter(int age) {
        super(age);
    }

    void career() {
        System.out.println("I want to be a doctor");
    }

    void partner() {
        System.out.println("I love Manish");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Son son = new Son(23);
        Daughter daughter = new Daughter(22);
        son.career();
        daughter.career();
        son.partner();
        daughter.partner();
        System.out.println(son.age);
        System.out.println(daughter.age);
        Parent.staticMethod();
    }
}
