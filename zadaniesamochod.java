interface Vehicle {
    void start();
    void stop();
    default void fuelUp() {
        System.out.println("Trwa tankowanie pojazdu");
    }
    static void service(){
        System.out.println("Check engine. Udaj sie do serwisu");
    }
}
class Car implements Vehicle{

    public void start() {
        System.out.println("Samochód sie odpala");
    }

    public void stop() {
        System.out.println("Samochód gaśnie");
    }
}
class Motorcycle implements Vehicle {

    public void start() {
        System.out.println("Motocykl sie odpala");
    }

    public void stop() {
        System.out.println("Motocykl gaśnie");
    }
}
public class zadaniesamochod {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        car.start();
        car.fuelUp();
        car.stop();

        Vehicle.service();

        System.out.println(" ");

        motorcycle.start();
        motorcycle.fuelUp();
        motorcycle.stop();

        Vehicle.service();
    }
}