import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
    }

    public void setOrderName(String name) {
        this.name = name;
    }
    

    public void setOrderIsReady(boolean ready) {
        this.ready = ready;
    }
    public void setItems(Item item) {
        this.items.add(item);
        this.total += item.getitemPrice();
    }


    public String getOrderName(){
        return this.name;
    }
    public double getOrdertotal(){
        return this.total;
    }
    public boolean getOrderIsReady(){
        return this.ready;
    }
}