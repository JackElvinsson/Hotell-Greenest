package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusTest {

    Kaktus test = new Kaktus("test", 0.02);
    @Test
    void vätska() {

        assert (test.getCENTILITER_VÄTSKA_KAKTUS() == 2);
        assert (test.getCENTILITER_VÄTSKA_KAKTUS() != 10);
    }
}