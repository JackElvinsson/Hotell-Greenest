package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeTest {

    Köttätande test = new Köttätande("test", 0.7);

    @Test
    void vätska() {

       assert (test.getVÄTSKA_BASNIVÅ_LITER() + (test.getLITER_PER_METER_KÖTTÄTANDE() * test.getLängdIMeter()) == 0.24);
       assert (test.getVÄTSKA_BASNIVÅ_LITER() + (test.getLITER_PER_METER_KÖTTÄTANDE() * test.getLängdIMeter()) != 111);
    }
}