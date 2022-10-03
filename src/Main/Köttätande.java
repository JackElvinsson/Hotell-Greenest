package Main;

public class Köttätande extends Växt {

    public Köttätande(String namn, double längdIMeter) {
        super(namn, längdIMeter);
    }

    private final double PROTEINDRYCK_PER_METER = 0.2;
    private final double BASNIVÅ_LITER = 0.1;


    @Override
    public String vätska() {

        return getNamn() + " behöver " + (BASNIVÅ_LITER + (PROTEINDRYCK_PER_METER * getLängdIMeter())) + " liter proteindryck/dag.";
    }
}
