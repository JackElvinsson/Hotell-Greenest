package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VätskeTypTest {

    String vätska = "vatten";

    @Test
    void valueOf() {
        assert (vätska.equals("vatten"));
        assert (!vätska.equals("coca cola"));
    }
}