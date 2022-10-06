package Main;

public class Köttätande extends Växt {

    public Köttätande(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.PROTEIN_DRYCK);
    }

    // *** INKAPSLING ***
    // Alla instansvariabler är private och kan bara nås via getters och setters
    private final double LITER_PER_METER_KÖTTÄTANDE = 0.2;
    private final double VÄTSKA_BASNIVÅ_LITER = 0.1;

    public double getLITER_PER_METER_KÖTTÄTANDE() {
        return LITER_PER_METER_KÖTTÄTANDE;
    }

    public double getVÄTSKA_BASNIVÅ_LITER() {
        return VÄTSKA_BASNIVÅ_LITER;
    }

    // *** POLYMORFISM ***
    // Här uppnås polymorfism genom att anropa metoden vätska() som ursprungligen
    // ligger som en tom, abstrakt metod i interfacet Bevattning.
    @Override
    public String bevattningPrintable() {

        return getNamn() + " behöver " + (VÄTSKA_BASNIVÅ_LITER + (LITER_PER_METER_KÖTTÄTANDE * getLängdIMeter())) + " liter " + getTypAvVätska().vätskaTillVäxt + " /dag.";
    }
}
