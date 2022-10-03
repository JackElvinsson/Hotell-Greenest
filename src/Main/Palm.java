package Main;

public class Palm extends Växt {


    public Palm(String namn, double längdIMeter) {
        super(namn, längdIMeter);
    }

    private final double LITER_VATTEN_DAG = 0.5;

    @Override
    public String vätska() {
        return getNamn() + " behöver " + LITER_VATTEN_DAG * (getLängdIMeter()) + " liter vatten/dag.";

    }
}
