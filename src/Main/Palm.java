package Main;

public class Palm extends Växt {


    public Palm(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.VATTEN);
    }

    // *** INKAPSLING ***
    // Alla instansvariabler är private och kan bara nås via getters och setters
    private final double LITER_PER_METER_PALM = 0.5;

    public double getLITER_PER_METER_PALM() {
        return LITER_PER_METER_PALM;
    }

    //*** POLYMORFISM ***
    // Här uppnås polymorfism genom att anropa metoden vätska() som ursprungligen
    // ligger som en tom, abstrakt metod i interfacet Bevattning.
    @Override
    public String bevattningPrintable() {
        return getNamn() + " behöver " + LITER_PER_METER_PALM * (getLängdIMeter()) + " liter " + getTypAvVätska().vätskaTillVäxt + " /dag.";

    }
}
