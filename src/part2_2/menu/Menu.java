package part2_2.menu;
import java.util.ArrayList;

public class Menu {
    private ArrayList<MenuItem> menuItems;

    public Menu() {
        this.menuItems = new ArrayList<>();
    }

    public void addMenuItem(MenuItem menuItem) {
        this.menuItems.add(menuItem);
    }

    public void removeMenuItem(MenuItem menuItem) {
        this.menuItems.remove(menuItem);
    }

    public void printMenuItems() {
        System.out.println("Menu Items:");
        for (MenuItem menuItem : menuItems) {
            menuItem.display();
        }
    }
}
