package Shop;

import Shop.Inventory.Item;

import java.util.ArrayList;

public class Shop implements ISell{

    private String name;
    private ArrayList<Item> stock;


    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList();
    }

    public String getName() {
        return name;
    }

    public void addItem(Item item){

       stock.add(item);
    }

    public void removeItem(Item item){

        stock.remove(item);
    }

    public ArrayList<Item> getStock(){
        return stock;
    }

    public void calculateRetailPrice(Item item) {
        double markup = (item.getTradePrice() < 500.00) ? 1.6 : 1.2;
        item.setRetailPrice(item.getTradePrice() * markup);
    }


}
