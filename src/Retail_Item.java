public class Retail_Item {
    String description;
    int unitsOnHand;
    double price;

    public Retail_Item(String description, int unitsOnHand, double price) {
        this.description = description;
        this.unitsOnHand = unitsOnHand;
        this.price = price;
    }
    public String getDescription() {
        return description;
    }
    public int getunitsOnHand() { 
        return unitsOnHand;
    }
    public double getprice() {
        return price;
    }


    public void setDescription(String description) {
        this.description = description;
    }
    public void setunitsOnHand(int unitsOnHand) {
        this.unitsOnHand = unitsOnHand;
    }
    public void setprice(double price) {
        this.price = price;
    }
    public static void main(String[] args) {
        Retail_Item item1 = new Retail_Item("Jacket", 12, 59);
        Retail_Item item2 = new Retail_Item("Jeans", 12, 59);
        Retail_Item item3 = new Retail_Item("Pant", 12, 59);
        System.out.println(item1.getDescription()+""+item1.getunitsOnHand()+""+item1.getprice());
        System.out.println("--------");
        System.out.println(item2.getDescription()+" "+item2.getunitsOnHand()+""+item2.getprice());
        System.out.println("--------");
        System.out.println(item3.getDescription()+" "+item3.getunitsOnHand()+""+item3.getprice());

    }

}
