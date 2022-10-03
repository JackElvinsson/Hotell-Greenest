package Main;

public abstract class Växt implements Bevattning {

    protected String namn;
    protected double längdIMeter;

    public Växt(String namn,double längdIMeter) {
        this.namn = namn;
        this.längdIMeter = längdIMeter;

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
