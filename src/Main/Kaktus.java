package Main;

public class Kaktus extends Växt {
    public Kaktus(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.MINERAL_VATTEN);
    }

    // *** INKAPSLING ***
    // Alla instansvariabler är private och kan bara nås via getters och setters
    private final double LITER_VÄTSKA_KAKTUS = 0.02;

    public double getLITER_VÄTSKA_KAKTUS() {
        return LITER_VÄTSKA_KAKTUS;
    }

    //*** POLYMORFISM ***
    // Här uppnås polymorfism genom att anropa metoden vätska() som ursprungligen
    // ligger som en tom, abstrakt metod i interfacet Bevattning.
    @Override
    public String bevattningPrintable() {

        return getNamn() + " behöver " + LITER_VÄTSKA_KAKTUS + " liter " + getTypAvVätska().vätskaTillVäxt + " /dag.";
    }
}
