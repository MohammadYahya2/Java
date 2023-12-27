import java.util.ArrayList;
import java.util.Scanner;

public class CafeUtil {

    public int getStreakGoal() {

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        return sum;

    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }

        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }

    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("please enter your name ");
        Scanner in = new Scanner(System.in);
        String username = in.nextLine();
        System.out.println("Hello," + username);
        System.out.println("There are " + "" + customers.size() + " people in front of you");
        customers.add(username);
        for (String customer : customers) {
            System.out.println(customer);
        }

    }

}
