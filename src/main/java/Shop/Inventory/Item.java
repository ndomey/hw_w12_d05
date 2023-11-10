package Shop.Inventory;


import Shop.ISell;




public abstract class Item implements ISell {

    private String name;
    public double tradePrice;
    private double retailPrice;

    public Item(String name, double tradePrice) {
        this.name = name;
        this.tradePrice = tradePrice;
        this.retailPrice = retailPrice;
    }

    public String getName() {
        return name;
    }

    public double getTradePrice() {
        return tradePrice;
    }

    public double getRetailPrice() { return retailPrice; }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void calculateRetailPrice(Item item) {
        double markup = (tradePrice < 500.00) ? 1.6 : 1.2;
        retailPrice = tradePrice * markup;
    }
}
