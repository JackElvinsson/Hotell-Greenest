package Main;

public enum VätskeTyp {

    VATTEN("kranvatten"), PROTEIN_DRYCK("proteindryck"), MINERAL_VATTEN("mineralvatten");

    public final String vätskaTillVäxt;

    VätskeTyp(String s) {
        vätskaTillVäxt = s;
    }
}
