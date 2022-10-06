package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmTest {

    Palm test = new Palm("test", 5);

    @Test
    void bevattningPrintable() {
         assert (test.getLITER_PER_METER_PALM() * test.getLängdIMeter() == 2.5);
         assert (test.getLITER_PER_METER_PALM() * test.getLängdIMeter() != 123);
    }
}