package part2_2.restaurant;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(String name, String address, int maxCapacity, double rating) {
        super(name, address, maxCapacity, rating);
    }

    @Override
    public void printInfo(){
        System.out.println("Cuisine: Italian");
        super.printInfo();
    }

    @Override
    public void printInfo(boolean includeRating){
        System.out.println("Cuisine: Italian");
        super.printInfo();
    }


    @Override
    protected void prepareSpecialty() {
        System.out.println("Preparing specialty: Pizza Margherita");
    }

}
