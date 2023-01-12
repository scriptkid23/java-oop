class Vehicle {
    public void whoami() {
        System.out.println("I am Vehicle");
    }
}

class Car extends Vehicle {
    public void whoami() {
        System.out.println("I am Car");
    }
}

class Bicycle extends Vehicle {
    public void whoami() {
        System.out.println("I am Bicycle");
    }
}

public class Polymorphism {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bicycle = new Bicycle();

        vehicle.whoami();
        car.whoami();
        bicycle.whoami();
    }
}