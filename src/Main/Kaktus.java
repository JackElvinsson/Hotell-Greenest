package Main;

public class Kaktus extends Växt {
    public Kaktus(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.MINERAL_VATTEN);
    }

    private final int CENTILITER_VÄTSKA_KAKTUS = 2;
    @Override
    public String vätska() {

        return getNamn() + " behöver " + CENTILITER_VÄTSKA_KAKTUS + " cl " + typAvVätska.vätskaTillVäxt + " /dag.";
    }
}
