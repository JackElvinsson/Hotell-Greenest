package Main;

public abstract class Växt implements Bevattning {

    protected String namn;
    protected double längdIMeter;

    protected VätskeTyp typAvVätska;

    public Växt(String namn,double längdIMeter, VätskeTyp vätska) {
        this.namn = namn;
        this.längdIMeter = längdIMeter;
        this.typAvVätska = vätska;

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
