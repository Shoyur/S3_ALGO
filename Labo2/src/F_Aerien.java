import java.util.Date;

public abstract class F_Aerien extends Vehicule {

    private int altituteMax;
    private int pousseeAxiale;
    private int autonomieAir;
    
    public F_Aerien(int numeroSerie, String fabricant, Date dateFabrication, int altituteMax, int pousseeAxiale, int autonomieAir) {
        super(numeroSerie, fabricant, dateFabrication);
        this.altituteMax = altituteMax;
        this.pousseeAxiale = pousseeAxiale;
        this.autonomieAir = autonomieAir;
    }

    public int getAltituteMax() {
        return altituteMax;
    }

    public void setAltituteMax(int altituteMax) {
        this.altituteMax = altituteMax;
    }

    public int getPousseeAxiale() {
        return pousseeAxiale;
    }

    public void setPousseeAxiale(int pousseeAxiale) {
        this.pousseeAxiale = pousseeAxiale;
    }

    public int getAutonomieAir() {
        return autonomieAir;
    }

    public void setAutonomieAir(int autonomieAir) {
        this.autonomieAir = autonomieAir;
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
