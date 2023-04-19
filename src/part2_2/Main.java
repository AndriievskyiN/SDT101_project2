package part2_2;
import part2_2.menu.Dish;
import part2_2.menu.Drink;
import part2_2.menu.Menu;
import part2_2.restaurant.ItalianRestaurant;
import part2_2.restaurant.MexicanRestaurant;
import part2_2.restaurant.Order;

public class Main {
    public static void main(String[] args) {
        // Create menu items
        Dish spaghetti = new Dish("Spaghetti Carbonara", "Pasta", 12.99, "main course");
        Dish lasagna = new Dish("Lasagna Bolognese", "Pasta", 14.99, "main course");
        Drink cola = new Drink("Cola", "Soft drink", 1.99, false);
        Drink beer = new Drink("Beer", "Alcoholic drink", 3.99, true);

        // Create menu and add items
        Menu menu = new Menu();
        menu.addMenuItem(spaghetti);
        menu.addMenuItem(lasagna);
        menu.addMenuItem(cola);
        menu.addMenuItem(beer);

        // Create Italian restaurant and set menu
        ItalianRestaurant italianRestaurant = new ItalianRestaurant("Mario's Italian", "123 Main St.", 200, 5.0);
        italianRestaurant.setMenu(menu);

        // Create Mexican restaurant and set menu
        MexicanRestaurant mexicanRestaurant = new MexicanRestaurant("Juan's Mexican", "456 Broad St.", 50, 3.5);
        mexicanRestaurant.setMenu(menu);

        // Create orders for Italian and Mexican restaurants
        Order italianOrder = new Order();
        italianOrder.addItem(spaghetti);
        italianOrder.addItem(cola);
        italianOrder.addItem(lasagna);

        Order mexicanOrder = new Order();
        mexicanOrder.addItem(beer);

        // Print display information for Italian and Mexican restaurants
        System.out.println("Italian Restaurant:");
        System.out.println("--------");
        italianRestaurant.printInfo(true);
        System.out.println("--------");
        System.out.println("Order:");
        italianOrder.display();
        System.out.println();

        System.out.println("Mexican Restaurant:");
        System.out.println("--------");
        mexicanRestaurant.printInfo(true);
        System.out.println("--------");
        System.out.println("Order:");
        mexicanOrder.display();
        System.out.println();

        italianOrder.getCheck(italianRestaurant, italianRestaurant.getName() + "_check.txt");
        mexicanOrder.getCheck(mexicanRestaurant, mexicanRestaurant.getName() + "_check.txt");
    }
}
