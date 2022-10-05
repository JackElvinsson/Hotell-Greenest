package Main;

public class Kaktus extends Växt {
    public Kaktus(String namn, double längdIMeter) {
        super(namn, längdIMeter, VätskeTyp.MINERAL_VATTEN);
    }

    private final int CENTILITER_VÄTSKA_KAKTUS = 2;

    public int getCENTILITER_VÄTSKA_KAKTUS() {
        return CENTILITER_VÄTSKA_KAKTUS;
    }

    //*** POLYMORFISM ***
    // Här uppnås polymorfism genom att anropa metoden vätska() som ursprungligen
    // ligger som en abstrakt metod i klassen/interfacet Bevattning.
    @Override
    public String vätska() {

        return getNamn() + " behöver " + CENTILITER_VÄTSKA_KAKTUS + " cl " + getTypAvVätska().vätskaTillVäxt + " /dag.";
    }
}
