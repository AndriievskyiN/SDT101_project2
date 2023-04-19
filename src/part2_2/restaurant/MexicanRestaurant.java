package part2_2.restaurant;

public class MexicanRestaurant extends Restaurant {

    public MexicanRestaurant(String name, String address, int maxCapacity, double rating) {
        super(name, address, maxCapacity, rating);
    }

    @Override
    public void printInfo(){
        System.out.println("Cuisine: Mexican");
        super.printInfo();
    }

    @Override
    public void printInfo(boolean includeRating){
        System.out.println("Cuisine: Mexican");
        super.printInfo();
    }


    @Override
    protected void prepareSpecialty() {
        System.out.println("Preparing tacos and guacamole...");
    }


}
