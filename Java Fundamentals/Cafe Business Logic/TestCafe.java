import java.util.ArrayList;
import java.util.Arrays;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil test = new CafeUtil();
        /*
         * You will need add 1 line to this file to create an instance
         * of the CafeUtil class.
         * Hint: it will need to correspond with the variable name used below..
         */
        System.out.println("* ============ App Test Cases ============= *");
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", test.getStreakGoal());
        System.out.println("----- Order Total Test-----");
        double[] lineItems = { 3.5, 1.5, 4.0, 4.5 };
        System.out.printf("Order total: %s \n\n", test.getOrderTotal(lineItems));
        System.out.println("----- Display Menu Test-----");
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        test.displayMenu(menu);
        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        System.out.println("--- Test 4 times ---");
        for (int i = 0; i < 4; i++) {
            test.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
