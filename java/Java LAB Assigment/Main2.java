// Interface for vehicles
interface Vehicle {
    void start();
    void stop();
}

// Interface for cars
interface Car extends Vehicle {
    void drive();
}

// Interface for trucks
interface Truck extends Vehicle {
    void load();
}

// Car class implementing Car interface
class Sedan implements Car {
    @Override
    public void start() {
        System.out.println("Sedan starting...");
    }

    @Override
    public void stop() {
        System.out.println("Sedan stopping...");
    }

    @Override
    public void drive() {
        System.out.println("Sedan driving...");
    }
}

// Truck class implementing Truck interface
class Pickup implements Truck {
    @Override
    public void start() {
        System.out.println("Pickup starting...");
    }

    @Override
    public void stop() {
        System.out.println("Pickup stopping...");
    }

    @Override
    public void load() {
        System.out.println("Pickup loading...");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Car sedan = new Sedan();
        sedan.start();
        sedan.drive();
        sedan.stop();

        Truck pickup = new Pickup();
        pickup.start();
        pickup.load();
        pickup.stop();
    }
}