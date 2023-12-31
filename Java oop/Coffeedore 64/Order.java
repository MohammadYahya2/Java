import java.util.ArrayList;

public class Order {
    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<>();

    public Order() {
    }

    public Order(String name) {
        this.name = name;
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public double getStatusMessage() {
        if (ready == true) {
            System.out.println("the order in ready");
        } else {
            System.out.println("Thank you for waiting. Your order will be ready soon.");
        }
        return 0;
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Order [name=" + name + ", ready=" + ready + ", items=" + items
                + ", getOrderTotal()=" + getOrderTotal() + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isReady() {
        return ready;
    }

    public void setReady(boolean ready) {
        this.ready = ready;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}