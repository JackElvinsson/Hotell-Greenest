package Main;

// Låter superklassen Växt implementera interfacet Bevattning så att alla sub-klasser
// till Växt kan använda interfacet utan att behöva implementera det till varje enskild sub-klass
public abstract class Växt implements Bevattning {

    // *** INKAPSLING ***
    // Alla instansvariabler är private och kan bara nås via getters och setters
    private String namn;
    private double längdIMeter;

    //Enum deklaration
    private VätskeTyp typAvVätska;

    public Växt(String namn, double längdIMeter, VätskeTyp vätska) {
        this.namn = namn;
        this.längdIMeter = längdIMeter;
        this.typAvVätska = vätska;

    }

    public VätskeTyp getTypAvVätska() {
        return typAvVätska;
    }

    public double getLängdIMeter() {
        return längdIMeter;
    }

    public void setLängdIMeter(int längdIMeter) {
        this.längdIMeter = längdIMeter;
    }

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }


}
