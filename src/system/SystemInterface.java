package system;

import system.commands.Invoker;

public class SystemInterface {
    static Invoker invoker;

    /**
     * Sets the invoker of the system interface
     * @param _invoker the invoker object to set
     */
    public static void setInvoker(Invoker _invoker) {
        invoker = _invoker;
    }

    /**
     * Gets the menu of the system via the invoker
     * @return a string array to display to the user interface
     */
    public static String[] getMenu() {
        return invoker.getMenu();
    }

    /**
     * Submits an order to the system given a menu item number
     * @param menuItemNum the menu item number to add to orders
     * @return the stringified order object
     */
    public static String submitOrder(String menuItemNum) {
        return invoker.submitOrder(menuItemNum);
    }

    /**
     * Gets the tab of the orders submitted to the system
     * @return a string array of orders to display to the user interface
     */
    public static String[] getTab() {
        return invoker.getTab();
    }
}
