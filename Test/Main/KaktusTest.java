package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    Kaktus test = new Kaktus("test", 0.02);
    @Test
    void bevattningPrintable() {

        assert (test.getLITER_VÄTSKA_KAKTUS() == 0.02);
        assert (test.getLITER_VÄTSKA_KAKTUS() != 10);
    }
}