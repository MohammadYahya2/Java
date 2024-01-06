package Coffe;

public class Diver {
    public static void main(String[] args) {
        CoffeeKiosk kiosk = new CoffeeKiosk();
        kiosk.addMenuItem("Coffee", 1.50);
        kiosk.addMenuItem("Latte", 2.50);
        kiosk.addMenuItem("Cappuccino", 3.00);
        kiosk.addMenuItem("hotColat", 2.00);
        kiosk.newOrder();
        System.out.println("Menu:");
        kiosk.displayMenu();
        kiosk.toString();
        	

        
    }
}
