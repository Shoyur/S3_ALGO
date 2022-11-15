public abstract class Vehicule {

    private int vitesseKM = 0;

    public int getVitesseKM() {
        return vitesseKM;
    }

    public void setVitesseKM(int vitesseKM) {
        this.vitesseKM = vitesseKM;
    }

    public abstract void voyager();
    
}
