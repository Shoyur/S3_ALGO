import java.util.Date;

public abstract class F_Terrestre extends Vehicule {

    private String gasPneus;
    private boolean attacheRemorque;
    private double hauteurPassageLibreM;
    
    public F_Terrestre(int numeroSerie, String fabricant, Date dateFabrication, String gasPneus,
            boolean attacheRemorque, double hauteurPassageLibreM) {
        super(numeroSerie, fabricant, dateFabrication);
        this.gasPneus = gasPneus;
        this.attacheRemorque = attacheRemorque;
        this.hauteurPassageLibreM = hauteurPassageLibreM;
    }

    public String getGasPneus() {
        return gasPneus;
    }

    public void setGasPneus(String gasPneus) {
        this.gasPneus = gasPneus;
    }

    public boolean isAttacheRemorque() {
        return attacheRemorque;
    }

    public void setAttacheRemorque(boolean attacheRemorque) {
        this.attacheRemorque = attacheRemorque;
    }

    public double getHauteurPassageLibreM() {
        return hauteurPassageLibreM;
    }

    public void setHauteurPassageLibreM(double hauteurPassageLibreM) {
        this.hauteurPassageLibreM = hauteurPassageLibreM;
    }

    @Override
    public Date getDateFabrication() {
        // TODO Auto-generated method stub
        return super.getDateFabrication();
    }

    @Override
    public String getFabricant() {
        // TODO Auto-generated method stub
        return super.getFabricant();
    }

    @Override
    public int getNumeroSerie() {
        // TODO Auto-generated method stub
        return super.getNumeroSerie();
    }

    @Override
    public void setDateFabrication(Date dateFabrication) {
        // TODO Auto-generated method stub
        super.setDateFabrication(dateFabrication);
    }

    @Override
    public void setFabricant(String fabricant) {
        // TODO Auto-generated method stub
        super.setFabricant(fabricant);
    }

    @Override
    public void setNumeroSerie(int numeroSerie) {
        // TODO Auto-generated method stub
        super.setNumeroSerie(numeroSerie);
    }

}
