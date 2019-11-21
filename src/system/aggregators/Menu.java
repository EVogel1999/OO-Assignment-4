package system.aggregators;

import system.entities.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menu;

    public Menu() {
        menu = new ArrayList<>();
    }

    public Menu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public List<MenuItem> getMenu() {
        return menu;
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = menu;
    }

    public MenuItem getMenuItem(int i) {
        return menu.get(i);
    }

    public void removeMenuItem(int i) {
        menu.remove(i);
    }

    public void removeMenuItem(Object item) {
        menu.remove(item);
    }

    public void addMenuItem(MenuItem item) {
        menu.add(item);
    }
}
