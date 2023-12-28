public class Driver {

    public static void main(String[] args) {
        Order order = new Order();
        order.setName("Mohammad");
        order.setReady(false);
        System.out.println("------------------------");
        Item item1 = new Item("|" + "Latte", 25);
        Item item2 = new Item("|" + "drip Coffe", 22.3);
        Item item3 = new Item("|" + "Capatino", 12.5);
        order.addItem(item1);
        order.addItem(item2);

        System.out.println(order.toString() + "\n");
        System.out.println("-----------------------------");
    }
}
