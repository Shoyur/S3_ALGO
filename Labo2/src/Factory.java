public class Factory {

    private Vehicule unVehicule;

    public Factory(Vehicule unVehicule) { 
        this.unVehicule = unVehicule; 
    }

    public Vehicule faireVehicule() {
        return unVehicule.clone();
    }
}