import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
        Order orderTest = new Order();
        
        Item item1 = new Item();
        Item item2 = new Item();
        Item item3 = new Item();
        Item item4 = new Item();

        item1.setItemName("mocha");
        item2.setItemName("latte");
        item3.setItemName("drip");
        item4.setItemName("cappucciono");

        item1.setItemPrice(4.3);
        item2.setItemPrice(1.2);
        item3.setItemPrice(6.3);
        item4.setItemPrice(23.3);

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();
        
        order1.setOrderName("Cindhiri");
        order2.setOrderName("Jimmy");
        order3.setOrderName("Noah");
        order4.setOrderName("Sam");

        order1.setItems(item3);
        order2.setItems(item1);
        order3.setItems(item4);        
        order4.setItems(item2);

        order1.setOrderIsReady(true);

        order4.setItems(item2);
        order4.setItems(item2);

        order2.setOrderIsReady(true);



        // Menu items
    
        // Order variables -- order1, order2 etc.
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.getOrderName());
        System.out.printf("Total: %s\n", order1.getOrdertotal());
        System.out.printf("Ready: %s\n", order1.getOrderIsReady());

        System.out.printf("Name: %s\n", order2.getOrderName());
        System.out.printf("Total: %s\n", order2.getOrdertotal());
        System.out.printf("Ready: %s\n", order2.getOrderIsReady());

        System.out.printf("Name: %s\n", order3.getOrderName());
        System.out.printf("Total: %s\n", order3.getOrdertotal());
        System.out.printf("Ready: %s\n", order3.getOrderIsReady());

        System.out.printf("Name: %s\n", order4.getOrderName());
        System.out.printf("Total: %s\n", order4.getOrdertotal());
        System.out.printf("Ready: %s\n", order4.getOrderIsReady());
    }
}
