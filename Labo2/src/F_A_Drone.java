import java.util.Date;

public class F_A_Drone extends F_Aerien {

    private int voltage;
    private boolean camera;
    private int porteeKM;
    
    public F_A_Drone(int numeroSerie, String fabricant, Date dateFabrication, int altituteMax, int pousseeAxiale,
            int autonomieAir, int voltage, boolean camera, int porteeKM) {
        super(numeroSerie, fabricant, dateFabrication, altituteMax, pousseeAxiale, autonomieAir);
        this.voltage = voltage;
        this.camera = camera;
        this.porteeKM = porteeKM;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }

    public int getPorteeKM() {
        return porteeKM;
    }

    public void setPorteeKM(int porteeKM) {
        this.porteeKM = porteeKM;
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
