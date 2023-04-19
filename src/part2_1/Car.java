package part2_1;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String make, String model, int numDoors) {
        super(make, model);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        super.start();
        System.out.println("Car starting...");
    }
}
