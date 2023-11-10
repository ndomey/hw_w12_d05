package Shop.Inventory.Instruments;




public class Guitar extends Instrument {

    private GuitarType guitarType;

    public Guitar(String name, double tradePrice, InstrumentType instrumentType, GuitarType guitarType) {
        super(name, tradePrice, instrumentType);
        this.guitarType = guitarType;

    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public String play() {

        return "Strum-strum...";
    }

}


