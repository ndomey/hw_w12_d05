package Shop.Inventory.Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PianoTest {
    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Yamaha", 2399.00, InstrumentType.KEYBOARD, PianoType.UPRIGHT_PIANO);
        piano.calculateRetailPrice(piano);
    }

    @Test
    public void canGetName(){
        assertEquals("Yamaha", piano.getName());
    }

    @Test
    public void hasTradePrice(){
        assertEquals(2399.00, piano.getTradePrice(), 0.01);
    }

    @Test
    public void hasRetailPrice(){
        assertEquals(2878.80, piano.getRetailPrice(), 0.01);
    }

    @Test
    public void CanGetInstrumentType(){
        assertEquals(InstrumentType.KEYBOARD, piano.getInstrumentType());
    }

    @Test
    public void CanGetPianoType(){
        assertEquals(PianoType.UPRIGHT_PIANO, piano.getPianoType());
    }

    @Test
    public void canPlay(){
        assertEquals("ping-ding-ding-ping...", piano.play());
    }
}