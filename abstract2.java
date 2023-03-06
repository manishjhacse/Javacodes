abstract class Aeroplane {
    abstract void takeoff();
    abstract void fly();
    void landing() {
        System.out.println("Plane is landing...");
    }
}

class CargoPlane extends Aeroplane {
    void takeoff() {
        System.out.println("Cargo plane needs long runway to takeoff");
    }
    void fly() {
        System.out.println("Cargo plane flies at low height");
    }
    void alert() {
        System.out.println("alert...");
    }
}

class PassengerPlane extends Aeroplane {
    void takeoff() {
        System.out.println("Passenger plane needs medium runway to takeoff");
    }
    void fly() {
        System.out.println("Passenger plane flies at medium height");
    }
}

class FighterPlane extends Aeroplane {
    void takeoff() {
        System.out.println("Fighter plane needs small runway to takeoff");
    }
    void fly() {
        System.out.println("Fighter plane flies at high height");
    }
}

public class abstract2 {
    public static void main(String args[]) {
        Aeroplane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
        cp.landing();
        // cp.alert() it throw error because by using parent class reference we can not call specialised method
        ((CargoPlane) cp).alert(); // Downcasting - changing the reference from parent to child class

        Aeroplane pp = new PassengerPlane();
        pp.takeoff();
        pp.fly();
        pp.landing();

        Aeroplane ff = new FighterPlane();
        ff.takeoff();
        ff.fly();
        ff.landing();
    }
}