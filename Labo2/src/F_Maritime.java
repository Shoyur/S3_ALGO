import java.util.Date;

public abstract class F_Maritime extends Vehicule {

    private String couleur;
    private boolean vesteFlotaisonFourni;
    private int vitesseNoeudsMax;
    
    public F_Maritime(int numeroSerie, String fabricant, Date dateFabrication, String couleur,
            boolean vesteFlotaisonFourni, int vitesseNoeudsMax) {
        super(numeroSerie, fabricant, dateFabrication);
        this.couleur = couleur;
        this.vesteFlotaisonFourni = vesteFlotaisonFourni;
        this.vitesseNoeudsMax = vitesseNoeudsMax;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boolean isVesteFlotaisonFourni() {
        return vesteFlotaisonFourni;
    }

    public void setVesteFlotaisonFourni(boolean vesteFlotaisonFourni) {
        this.vesteFlotaisonFourni = vesteFlotaisonFourni;
    }

    public int getVitesseNoeudsMax() {
        return vitesseNoeudsMax;
    }

    public void setVitesseNoeudsMax(int vitesseNoeudsMax) {
        this.vitesseNoeudsMax = vitesseNoeudsMax;
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
