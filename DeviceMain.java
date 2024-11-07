interface Device{
    void turnOn();
    void turnOff();
    default void charge(){
        System.out.println("Urządzenie się ładuje");
    }
    static void reset(){
        System.out.println("Urządzenie zostało zresetowane");
    }
}
class Smartphone implements Device{
    public void turnOn(){
        System.out.println("Telefon się odpala");
    }
    public void turnOff(){
        System.out.println("Telefon sie wyłącza");
    }
}
class Laptop implements Device{
    public void turnOn(){
        System.out.println("Laptop się odpala");
    }
    public void turnOff(){
        System.out.println("Laptop sie wyłącza");
    }
}

public class DeviceMain {
    public static void main(String[] args) {
        Device smartphone = new Smartphone();
        Device laptop = new Laptop();

        smartphone.turnOn();
        smartphone.charge();
        smartphone.turnOff();

        Device.reset();
        System.out.println(" ");
        laptop.turnOn();
        laptop.charge();
        laptop.turnOff();

        Device.reset();
    }
}