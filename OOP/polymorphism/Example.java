class Shape{
    void area(){
        System.out.println("I am in shape");
    }
}
class Circle extends Shape{
    void area(){
        System.out.println("Area is PI * R*R"); 
    }
}

class Square extends Shape{
    void area(){
        System.out.println("Area is square of side");
    }
}
class Triangle extends Shape{
   @Override//this is called annotaion
    void area(){
        System.out.println("Area is 0.5 base * height");
    }
}

public class example{
    public static void main(String[] args) {
        Shape shape=new Shape();
        Circle circle=new Circle();
        Square square=new Square();
        Shape triangle=new Triangle();
        shape.area();
        circle.area();
        square.area();
        triangle.area();
    }
}
