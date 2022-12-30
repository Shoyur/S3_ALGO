public abstract class Maison {

    private Etage etage;
    private Murs murs;
    private Toit toit;

    public Maison(Etage etage, Murs murs, Toit toit) {
        this.etage = etage;
        this.murs = murs;
        this.toit = toit;
    }

    public Etage getEtage() {
        return etage;
    }

    public void setEtage(Etage etage) {
        this.etage = etage;
    }

    public Murs getMurs() {
        return murs;
    }

    public void setMurs(Murs murs) {
        this.murs = murs;
    }

    public Toit getToit() {
        return toit;
    }

    public void setToit(Toit toit) {
        this.toit = toit;
    }

    public String getRepresentation() {
        return "\nConstruction d'une maison";
    }

}
