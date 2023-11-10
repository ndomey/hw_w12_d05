package Shop.Inventory.Instruments;

import Shop.Inventory.Item;

public abstract class Instrument extends Item implements IPlay{

    private InstrumentType instrumentType;

    public Instrument(String name, double tradePrice, InstrumentType instrumentType) {
        super(name, tradePrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

}
