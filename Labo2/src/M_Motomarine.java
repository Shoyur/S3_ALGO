import java.util.Date;

public class M_Motomarine extends Vehicule {
    
    Vehicule unVehicule;
    private int passagers123;
    private boolean espacePourLaBiere;
    private int anneesGarantie;

    public M_Motomarine(int numeroSerie, String fabricant, Date dateFabrication, String couleur,
            boolean vesteFlotaisonFourni, int vitesseNoeudsMax, int passagers123, boolean espacePourLaBiere,
            int anneesGarantie) {
        
        super(numeroSerie, fabricant, dateFabrication, couleur, vesteFlotaisonFourni, vitesseNoeudsMax);
        this.unVehicule = super.clone();
        this.unVehicule.passagers123 = passagers123;
        this.espacePourLaBiere = espacePourLaBiere;
        this.anneesGarantie = anneesGarantie;
    }
    
    public int getPassagers123() {
        return passagers123;
    }
    public void setPassagers123(int passagers123) {
        this.passagers123 = passagers123;
    }
    public boolean isEspacePourLaBiere() {
        return espacePourLaBiere;
    }
    public void setEspacePourLaBiere(boolean espacePourLaBiere) {
        this.espacePourLaBiere = espacePourLaBiere;
    }
    public int getAnneesGarantie() {
        return anneesGarantie;
    }
    public void setAnneesGarantie(int anneesGarantie) {
        this.anneesGarantie = anneesGarantie;
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


            // boolean vesteFlotaisonFourni, int vitesseNoeudsMax, int passagers123, boolean espacePourLaBiere,
            // int anneesGarantie
    public String toString() {
        return "[ No. de série = " + this.unVehicule.getNumeroSerie() + 
        ",   Fabricant = " + this.unVehicule.getFabricant() + 
        ",   Date de fabrication = " + this.unVehicule.getDateFabrication() + 
        ",   Couleur = " + this.unVehicule.s + 
        ",   Veste flotaison fournie = " + this.unVehicule.isVesteFlotaisonFourni() + 
        ",   Vitesse maximale (noeuds) = " + this.unVehicule.get() + 
        ",   Nb. de passagers = " + this.unVehicule.get() + 
        ",   Espace pour une bière = " + this.unVehicule.get() + 
        ",   Nb. d'années de garantie = " + this.unVehicule.getA+" ]\n";
    }

}
