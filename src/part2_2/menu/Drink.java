package part2_2.menu;

import part2_2.menu.MenuItem;

public class Drink extends MenuItem {
    private boolean isAlcoholic;

    public Drink(String name, String description, double price, boolean isAlcoholic) {
        super(name, description, price);
        this.isAlcoholic = isAlcoholic;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    @Override
    public void display() {
        System.out.println("Drink: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Price: " + getPrice());
        System.out.println("Alcoholic: " + isAlcoholic());
    }
}