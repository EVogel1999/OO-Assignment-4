package system.aggregators;

import system.entities.MenuItem;

public class Aggregator {
    private Menu menu;
    private Orders orders;

    public Aggregator() {
        menu = new Menu();
        orders = new Orders();
        populateMenu();
    }

    public Menu getMenu() {
        return menu;
    }

    public Orders getOrders() {
        return orders;
    }

    /**
     * Private method used to add menu items to the system
     */
    private void populateMenu() {
        menu.addMenuItem(new MenuItem("1", "Chicken", 12.00));
        menu.addMenuItem(new MenuItem("2", "Beef", 15.00));
        menu.addMenuItem(new MenuItem("3", "Pork", 20.00));
    }
}
