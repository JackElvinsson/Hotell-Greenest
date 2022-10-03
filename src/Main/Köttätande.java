package Main;

public class Köttätande extends Växt {

    public Köttätande(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.PROTEIN_DRYCK);
    }

    private final double LITER_PER_METER_KÖTTÄTANDE = 0.2;
    private final double VÄTSKA_BASNIVÅ_LITER = 0.1;


    @Override
    public String vätska() {

        return getNamn() + " behöver " + (VÄTSKA_BASNIVÅ_LITER + (LITER_PER_METER_KÖTTÄTANDE * getLängdIMeter())) + " liter " + typAvVätska.vätskaTillVäxt + " /dag.";
    }
}
