package part2_2.restaurant;
import part2_2.menu.MenuItem;
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;

public class Order {
    private ArrayList<MenuItem> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double getTotal() {
        double total = 0.0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        for (MenuItem item : items) {
            item.display();
            System.out.println("-----");
        }
        System.out.println("Total: " + getTotal());
    }

    public void getCheck(Restaurant restaurant, String fileName) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("Restaurant: " + restaurant.getName() + "\n\n");
            writer.write("Items:\n");
            for (MenuItem item : items) {
                writer.write("- " + item.getName() + " ($" + item.getPrice() + ")\n");
            }
            writer.write("\nTotal: $" + getTotal() + "\n");
            writer.close();
            System.out.println("Check written to file.");
        } catch (IOException e) {
            System.out.println("Error writing check to file.");
        }
    }
}