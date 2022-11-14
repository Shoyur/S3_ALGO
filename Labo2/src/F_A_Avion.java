import java.util.Date;

public class F_A_Avion extends F_Aerien {

    private int passagers;
    private boolean repasFourni;
    private boolean massageErotiqueFourni;
    
    public F_A_Avion(int numeroSerie, String fabricant, Date dateFabrication, int altituteMax, int pousseeAxiale,
            int autonomieAir, int passagers, boolean repasFourni, boolean massageErotiqueFourni) {
        super(numeroSerie, fabricant, dateFabrication, altituteMax, pousseeAxiale, autonomieAir);
        this.passagers = passagers;
        this.repasFourni = repasFourni;
        this.massageErotiqueFourni = massageErotiqueFourni;
    }

    public int getPassagers() {
        return passagers;
    }

    public void setPassagers(int passagers) {
        this.passagers = passagers;
    }

    public boolean isRepasFourni() {
        return repasFourni;
    }

    public void setRepasFourni(boolean repasFourni) {
        this.repasFourni = repasFourni;
    }

    public boolean isMassageErotiqueFourni() {
        return massageErotiqueFourni;
    }

    public void setMassageErotiqueFourni(boolean massageErotiqueFourni) {
        this.massageErotiqueFourni = massageErotiqueFourni;
    }

    @Override
    public int getAltituteMax() {
        // TODO Auto-generated method stub
        return super.getAltituteMax();
    }

    @Override
    public int getAutonomieAir() {
        // TODO Auto-generated method stub
        return super.getAutonomieAir();
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
    public int getPousseeAxiale() {
        // TODO Auto-generated method stub
        return super.getPousseeAxiale();
    }

    @Override
    public void setAltituteMax(int altituteMax) {
        // TODO Auto-generated method stub
        super.setAltituteMax(altituteMax);
    }

    @Override
    public void setAutonomieAir(int autonomieAir) {
        // TODO Auto-generated method stub
        super.setAutonomieAir(autonomieAir);
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
    public void setPousseeAxiale(int pousseeAxiale) {
        // TODO Auto-generated method stub
        super.setPousseeAxiale(pousseeAxiale);
    }
    
}
