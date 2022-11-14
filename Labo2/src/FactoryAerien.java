public class FactoryAerien extends Factory {

    public Vehicule creerVehicule() {
        return (new VehiculeAerien());
    }

}
