class aeroplane{
    void takeoff()
    {
        System.out.println("Aeroplane needs runway to fly");
    }
    void fly()
    {
        System.out.println("aeroplane flies");
    }
}
class cargoplane extends aeroplane{
    void takeoff()
    {
        System.out.println("cargoplane need long runway to takeoff");
    }
    void fly()
    {
        System.out.println("cargoplane flies at low height");
    }
}
class passangerplane extends aeroplane{
    void takeoff()
    {
        System.out.println("passanger plane needs medium runway to takeoff");
    }
    void fly()
    {
        System.out.println("passanger plane flies at medium height");
    }
}
public class launchPoly {
    public static void main(String args[])
    {
        cargoplane cp=new cargoplane();
        passangerplane pp=new passangerplane();
        aeroplane ref;
        ref=cp;
        System.out.println("information about caragoplane");
        ref.takeoff();
        ref.fly();
        System.out.println("information about passangerplane");
        ref=pp;
        ref.takeoff();
        ref.fly();

    }
}
