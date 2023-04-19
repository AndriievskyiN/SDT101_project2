package part2_2.restaurant;

import part2_2.menu.Menu;

import java.util.ArrayList;

public abstract class Restaurant {
    private String name;
    private String address;
    private int maxCapacity;
    private double rating;
    private Menu menu;

    public Restaurant(String name, String address, int maxCapacity, double rating) {
        setName(name);
        setAddress(address);
        setMaxCapacity(maxCapacity);
        setRating(rating);
        this.menu = new Menu();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getMaxCapacity(){
        return maxCapacity;
    }

    public double getRating(){
        return rating;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setMaxCapacity(int maxCapacity){
        this.maxCapacity = maxCapacity;
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void printMenu() {
        System.out.println("Menu for " + name + ":\n");
        menu.printMenuItems();
    }

    public void printInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getAddress());
        System.out.println("Maximum capacity: " + getMaxCapacity());
    }

    public void printInfo(boolean includeRating){
        System.out.println("Name: " + getName());
        System.out.println("Location: " + getAddress());
        System.out.println("Maximum capacity: " + getMaxCapacity());

        if (includeRating) {
            System.out.println("Rating: " + getRating());
        }
    }

    protected abstract void prepareSpecialty();
}

