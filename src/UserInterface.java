import system.SystemInterface;
import system.aggregators.Aggregator;
import system.commands.Invoker;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        // Initializes the system interface and scanner to get user input
        Scanner scanner = new Scanner(System.in);
        SystemInterface.setInvoker(new Invoker(new Aggregator()));

        // Switch statement (i.e. user interface) to show options
        printHelp();
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    printHelp();
                    break;
                case 2:
                    printMenu();
                    break;
                case 3:
                    submitOrder(scanner);
                    break;
                case 4:
                    printTab();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("I did not understand that option, try again!");
                    break;
            }
        }

        // Closes scanner and tells the user goodbye
        scanner.close();
        System.out.println("------ Goodbye ------");
    }

    /**
     * Prints the options a user can preform
     */
    private static void printHelp() {
        System.out.println("------ Help ------");
        System.out.println("[1] - Print Help");
        System.out.println("[2] - Print Menu");
        System.out.println("[3] - Submit Order");
        System.out.println("[4] - Get Tab");
        System.out.println("[5] - Quit");
        System.out.println();
    }

    /**
     * Prints the menu of the system
     */
    private static void printMenu() {
        System.out.println("------ Menu ------");
        for (String item: SystemInterface.getMenu()) {
            System.out.println(item);
        }
        System.out.println();
    }

    /**
     * Prints the user's tab
     */
    private static void printTab() {
        System.out.println("------ Tab ------");
        for (String tab: SystemInterface.getTab()) {
            System.out.println(tab);
        }
        System.out.println();
    }

    /**
     * Adds a menu item to the list of orders
     * @param scanner the user input scanner
     */
    private static void submitOrder(Scanner scanner) {
        System.out.println("------ Submit Order ------");
        System.out.println("Select Menu Item Number (must be a integer): ");
        String result = SystemInterface.submitOrder(scanner.next());
        System.out.println(result);
        System.out.println();
    }
}
