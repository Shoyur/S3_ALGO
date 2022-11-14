import java.util.Date;

public class F_M_Navire extends F_Maritime {

    private String TransportOuGuerre;
    private int KlaxonDecibels;
    private boolean appareilPhotoPermis;
    
    public F_M_Navire(int numeroSerie, String fabricant, Date dateFabrication, String couleur,
            boolean vesteFlotaisonFourni, int vitesseNoeudsMax, String transportOuGuerre, int klaxonDecibels,
            boolean appareilPhotoPermis) {
        super(numeroSerie, fabricant, dateFabrication, couleur, vesteFlotaisonFourni, vitesseNoeudsMax);
        TransportOuGuerre = transportOuGuerre;
        KlaxonDecibels = klaxonDecibels;
        this.appareilPhotoPermis = appareilPhotoPermis;
    }

    public String getTransportOuGuerre() {
        return TransportOuGuerre;
    }

    public void setTransportOuGuerre(String transportOuGuerre) {
        TransportOuGuerre = transportOuGuerre;
    }

    public int getKlaxonDecibels() {
        return KlaxonDecibels;
    }

    public void setKlaxonDecibels(int klaxonDecibels) {
        KlaxonDecibels = klaxonDecibels;
    }

    public boolean isAppareilPhotoPermis() {
        return appareilPhotoPermis;
    }

    public void setAppareilPhotoPermis(boolean appareilPhotoPermis) {
        this.appareilPhotoPermis = appareilPhotoPermis;
    }

    @Override
    public String getCouleur() {
        // TODO Auto-generated method stub
        return super.getCouleur();
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
    public int getVitesseNoeudsMax() {
        // TODO Auto-generated method stub
        return super.getVitesseNoeudsMax();
    }

    @Override
    public boolean isVesteFlotaisonFourni() {
        // TODO Auto-generated method stub
        return super.isVesteFlotaisonFourni();
    }

    @Override
    public void setCouleur(String couleur) {
        // TODO Auto-generated method stub
        super.setCouleur(couleur);
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

    @Override
    public void setVesteFlotaisonFourni(boolean vesteFlotaisonFourni) {
        // TODO Auto-generated method stub
        super.setVesteFlotaisonFourni(vesteFlotaisonFourni);
    }

    @Override
    public void setVitesseNoeudsMax(int vitesseNoeudsMax) {
        // TODO Auto-generated method stub
        super.setVitesseNoeudsMax(vitesseNoeudsMax);
    }

}
