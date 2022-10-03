package Main;

public class Palm extends Växt {


    public Palm(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.VATTEN);
    }

    private final double LITER_PER_METER_PALM = 0.5;

    //*** POLYMORFISM ***
    // Här uppnås polymorfism genom att anropa metoden vätska() som ursprungligen
    // ligger som en abstrakt metod i klassen/interfacet Bevattning.
    @Override
    public String vätska() {
        return getNamn() + " behöver " + LITER_PER_METER_PALM * (getLängdIMeter()) + " liter " + typAvVätska.vätskaTillVäxt + " /dag.";

    }
}
