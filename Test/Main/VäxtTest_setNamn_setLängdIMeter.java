package Main;

import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

class VäxtTest_setNamn_setLängdIMeter {

    Växt exempel = new Palm("Palm", 10);

    @Test
    void setLängdIMeter() {

        assert(exempel).getLängdIMeter() == 10;
        exempel.setLängdIMeter(20);
        assert(exempel).getLängdIMeter() == 20 ;

        System.out.println(exempel.längdIMeter);
    }

    @Test
    void setNamn() {

        assert (exempel).getNamn().equals("Palm");
        exempel.setNamn("Inte en Palm");
        assert (exempel).getNamn().equals("Inte en Palm");

        System.out.println(exempel.getNamn());

    }
}