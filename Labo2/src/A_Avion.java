public class A_Avion extends VehiculeAerien {

    public A_Avion() {
    }

    @Override
    public void voyager() {
        System.out.println("Je suis une avion et je voyage à " + this.getVitesseKM() + "km/h!");
    }

    @Override
    public int getAltitudeMaxM() {
        // TODO Auto-generated method stub
        return super.getAltitudeMaxM();
    }

    @Override
    public void setAltitudeMaxM(int altitudeMaxM) {
        // TODO Auto-generated method stub
        super.setAltitudeMaxM(altitudeMaxM);
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


    // Vehicule unVehicule;
    // private int passagers;
    // private boolean repasFourni;
    // private boolean massageErotiqueFourni;


    // public int getPassagers() {
    //     return this.passagers;
    // }
    // public void setPassagers(int passagers) {
    //     this.passagers = passagers;
    // }
    // public boolean isRepasFourni() {
    //     return this.repasFourni;
    // }
    // public void setRepasFourni(boolean repasFourni) {
    //     this.repasFourni = repasFourni;
    // }
    // public boolean isMassageErotiqueFourni() {
    //     return this.massageErotiqueFourni;
    // }
    // public void setMassageErotiqueFourni(boolean massageErotiqueFourni) {
    //     this.massageErotiqueFourni = massageErotiqueFourni;
    // }
    

    
}
