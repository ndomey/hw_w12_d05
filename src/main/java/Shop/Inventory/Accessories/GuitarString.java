package Shop.Inventory.Accessories;

import Shop.Inventory.Item;

public class GuitarString extends Item {

    private GuitarStringType guitarStringType;

    public GuitarString(String name, double tradePrice, GuitarStringType guitarStringType) {
        super(name, tradePrice);
        this.guitarStringType = guitarStringType;
    }

    public GuitarStringType getGuitarStringType() {
        return guitarStringType;
    }
}
