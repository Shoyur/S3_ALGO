public class FactoryAerien extends Factory {

    public FactoryAerien() {
    }

    public Vehicule creerVehicule(String lequel) {
        if (lequel == "Avion") { return (new A_Avion()); }
        else if (lequel == "Drone") { return (new A_Drone()); }
        else { return (new A_Helicoptere()); }
    }

}
