package Shop.Inventory.Instruments;



public class Piano extends Instrument implements IPlay{

    private PianoType pianoType;

    public Piano(String name, double tradePrice, InstrumentType instrumentType, PianoType pianoType) {
        super(name, tradePrice, instrumentType);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }
    
    public String play(){
        return "ping-ding-ding-ping...";
    }


}
