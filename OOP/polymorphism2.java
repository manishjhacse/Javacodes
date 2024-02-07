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
class fighterPlane extends aeroplane{
    void takeoff()
    {
        System.out.println("Fighter plane needs small runway to takeoff");
    }
    void fly()
    {
        System.out.println("Fighter plane flies at high height");
    }
}
class airport{
    public void poly(aeroplane ref)
    {
        ref.takeoff();
        ref.fly();
        System.out.println("-------------------------------------------------------");
    }
}
public class polymorphism2 {
    public static void main(String args[])
    {
        cargoplane cp=new cargoplane();
        passangerplane pp=new passangerplane();
        fighterPlane fp=new fighterPlane();

        // cp.takeoff();
        // cp.fly();
        // pp.takeoff();
        // pp.fly();
        // fp.takeoff();
        // fp.fly();
        airport a=new airport();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);
    }
}
