package Shop.Instruments;

import Shop.Inventory.Accessories.GuitarString;
import Shop.Inventory.Accessories.GuitarStringType;
import Shop.Inventory.Accessories.Metronom;
import Shop.Inventory.Instruments.Guitar;
import Shop.Inventory.Instruments.GuitarType;
import Shop.Inventory.Instruments.InstrumentType;
import Shop.Inventory.Item;
import Shop.Shop;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ShopTest {

    Guitar guitar1;
    GuitarString string1;
    Shop shop;



    @Before
    public void before(){
        Item item;
        guitar1 = new Guitar("Gibson", 1250.00, InstrumentType.STRING, GuitarType.ACOUSTIC);
        string1 = new GuitarString("Acoustic String Set",30.00, GuitarStringType.ACOUSTIC);
        shop = new Shop("Shop");
        shop.addItem(guitar1);
        shop.addItem(string1);
        shop.removeItem(string1);
        shop.calculateRetailPrice(guitar1);
    }

    @Test
    public void canGetName(){
        assertEquals("Gibson", guitar1.getName());
    }

    @Test
    public void canAddItem(){
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveItem(){
        assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canCalculateRetailPrice(){
        assertEquals(1500.00, shop.getStock().get(0).getRetailPrice());
    }



}
