package system.commands;

import system.aggregators.Aggregator;
import system.entities.OrderItem;

public class Invoker {
    Aggregator aggregator;

    public Invoker() {
        aggregator = new Aggregator();
    }

    public Invoker(Aggregator aggregator) {
        this.aggregator = aggregator;
    }

    /**
     * Gets the menu of the system
     * @return a string array of menu items
     */
    public String[] getMenu() {
        return (String[]) new CMDGetMenu(aggregator).execute();
    }

    /**
     * Submits an order to the system
     * @param menuItemNum the menu item num to order
     * @return a string of the order item object
     */
    public String submitOrder(String menuItemNum) {
        OrderItem item = new OrderItem(menuItemNum);
        return (String) new CMDSubmitOrder(aggregator, item).execute();
    }

    /**
     * Gets the tab of the ordered items
     * @return the string array of ordered items
     */
    public String[] getTab() {
        return (String[]) new CMDGetTab(aggregator).execute();
    }
}
