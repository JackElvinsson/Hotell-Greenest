package Main;

public class Palm extends Växt {


    public Palm(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.VATTEN);
    }

    private final double LITER_PER_METER_PALM = 0.5;

    @Override
    public String vätska() {
        return getNamn() + " behöver " + LITER_PER_METER_PALM * (getLängdIMeter()) + " liter " + typAvVätska.vätskaTillVäxt + " /dag.";

    }
}
