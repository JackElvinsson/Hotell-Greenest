package Main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VäxtTest_getNamn_getLängd {

    Växt exempel = new Palm("Palm", 10);
    Växt exempel2 = new Kaktus("Kaktus", 0.5);
    Växt exempel3 = new Köttätande("Köttätare", 0.15);


    @Test
    void getLängdIMeter() {

        assert(exempel).getLängdIMeter() == 10;
        assert(exempel2).getLängdIMeter() == 0.5;
        assert(exempel3).getLängdIMeter() == 0.15;
        assert(exempel).getLängdIMeter() != 222;
    }

    @Test
    void getNamn() {

        assert(exempel).getNamn() == "Palm";
        assert(exempel2).getNamn() == "Kaktus";
        assert(exempel3).getNamn() == "Köttätare";
        assert(exempel3).getNamn() != "asdasdasd";
    }
}