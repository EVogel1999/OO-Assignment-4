package system.aggregators;

import system.entities.MenuItem;
import system.entities.OrderItem;

public class Tab {
    private Orders orders;
    private Menu menu;

    public Tab(Orders orders, Menu menu) {
        this.orders = orders;
        this.menu = menu;
    }

    /**
     * Gets the tab in string array form for each ordered item
     * @return a string array of ordered items (with their description and price)
     */
    public String[] getTab() {
        String[] tab = new String[orders.getOrders().size()];

        int i = 0;
        for (OrderItem order : orders.getOrders()) {
            for (MenuItem item : menu.getMenu()) {
                if (order.getMenuItemNum().equals(item.getItemNum())) {
                    tab[i] = item.toString();
                    i++;
                }
            }
        }

        return tab;
    }
}
