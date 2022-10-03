package Main;

public enum VätskeTyp {

    VATTEN("vatten"), PROTEIN_DRYCK("proteindryck"), MINERAL_VATTEN("mineralvatten");

    public final String vätskaTillVäxt;

    VätskeTyp (String s) {
        vätskaTillVäxt = s;
    }
}
