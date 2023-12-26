public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double mochaPrice = 16.5;
        double dripCoffeePrice = 15;
        double lattePrice = 16;
        double cappuccinoPrice = 20;

        String customer1 = "Shatha";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        boolean isReadyOrder1 = true;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;

        double mochaPricebyShatha = 3;
        int lattesOrderedBySam = 2;
        boolean isReadyOrderSam = true;
        boolean isReadyOrderShatha = true;

        System.out.println(generalGreeting + customer1);

        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        double totaShatha = mochaPricebyShatha * mochaPrice;
        double totalSam = lattesOrderedBySam * lattePrice;
        System.out.println(displayTotalMessage + totaShatha);
        System.out.println(displayTotalMessage + totalSam);

        if (isReadyOrderSam) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }
        if (isReadyOrderShatha) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        double correctedTotalJimmy = lattePrice - dripCoffeePrice;
        System.out.println(displayTotalMessage + correctedTotalJimmy);
    }
}
