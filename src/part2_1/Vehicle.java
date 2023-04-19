package part2_1;

public class Vehicle {
    protected String make;
    protected String model;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void start() {
        System.out.println("Vehicle starting...");
    }

    public void stop() {
        System.out.println("Vehicle stopping...");
    }
}
