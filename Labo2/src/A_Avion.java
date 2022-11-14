public class A_Avion extends VehiculeAerien {

    Vehicule unVehicule;
    private int passagers;
    private boolean repasFourni;
    private boolean massageErotiqueFourni;

    public A_Avion(int numeroSerie, String fabricant, int passagers, boolean repasFourni, boolean massageErotiqueFourni) {
        this.unVehicule = super.clone();
        this.unVehicule.setType("Aérien");
        this.unVehicule.setNumeroSerie(numeroSerie);
        this.unVehicule.setFabricant(fabricant);
        this.passagers = passagers;
        this.repasFourni = repasFourni;
        this.massageErotiqueFourni = massageErotiqueFourni;
    }

    public int getPassagers() {
        return this.passagers;
    }
    public void setPassagers(int passagers) {
        this.passagers = passagers;
    }
    public boolean isRepasFourni() {
        return this.repasFourni;
    }
    public void setRepasFourni(boolean repasFourni) {
        this.repasFourni = repasFourni;
    }
    public boolean isMassageErotiqueFourni() {
        return this.massageErotiqueFourni;
    }
    public void setMassageErotiqueFourni(boolean massageErotiqueFourni) {
        this.massageErotiqueFourni = massageErotiqueFourni;
    }
    

    
}
