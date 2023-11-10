package Shop.Inventory.Accessories;

import Shop.Inventory.Item;

public class Metronom extends Item {

    MetronomType metronomType;

    public Metronom(String name, double tradePrice, MetronomType metronomType) {
        super(name, tradePrice);
        this.metronomType = metronomType;
    }

    public MetronomType getMetronomType() {
        return metronomType;
    }
}
