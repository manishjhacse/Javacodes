class aeroplane{

    void takeoff()
    {
        System.out.println("Plane is taking off");
    }
    void fly()
    {
        System.out.println("plane is flying");
    }
}
class cargoPlane extends aeroplane
{
    void fly()//as this method is already present in parent class so we are overridin it here
    {
        System.out.println("cargoplane flies at lower height");
    }
}
class passangerplane extends aeroplane
{
    void fly()//as this method is already present in parent class so we are overridin it here
    {
        System.out.println("passangerplane flies at medium height");
    }
}
public class overriding {
    public static void main(String args[])
    {
        cargoPlane cp=new cargoPlane();
        passangerplane pp=new passangerplane();
        cp.takeoff();
        cp.fly();
        pp.takeoff();
        pp.fly();
    }
}
