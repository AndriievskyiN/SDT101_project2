package part2_2.menu;

import part2_2.menu.MenuItem;

public class Dish extends MenuItem {
    private String category; // E.g. appetizer, main course, dessert, etc

    public Dish(String name, String description, double price, String category) {
        super(name, description, price);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public void display() {
        System.out.println("Dish: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
        System.out.println("Category: " + getCategory());
    }
}
