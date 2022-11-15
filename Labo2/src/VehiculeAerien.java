public abstract class VehiculeAerien extends Vehicule {

    int AltitudeMaxM;

    public int getAltitudeMaxM() {
        return AltitudeMaxM;
    }

    public void setAltitudeMaxM(int altitudeMaxM) {
        AltitudeMaxM = altitudeMaxM;
    }

    public void voyager() {
        
    }

    @Override
    public int getVitesseKM() {
        // TODO Auto-generated method stub
        return super.getVitesseKM();
    }

    @Override
    public void setVitesseKM(int vitesseKM) {
        // TODO Auto-generated method stub
        super.setVitesseKM(vitesseKM);
    }

}
