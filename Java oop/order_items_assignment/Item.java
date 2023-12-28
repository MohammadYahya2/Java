public class Item {
    private String name;
    private double price;


    public Item() {
    }

    public void setItemName(String name) {
        this.name = name;
    }
    public void setItemPrice(double price) {
        this.price = price;
    }
    public double getitemPrice(){
        return this.price;
    }
}