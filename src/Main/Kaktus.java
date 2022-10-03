package Main;

public class Kaktus extends Växt {
    public Kaktus(String namn, double längdIMeter) {
        super(namn, längdIMeter);
    }

    private final int VATTEN_TILL_KAKTUS = 2;
    @Override
    public String vätska() {

        return getNamn() + " behöver " + VATTEN_TILL_KAKTUS + " cl mineralvatten/dag.";
    }
}
