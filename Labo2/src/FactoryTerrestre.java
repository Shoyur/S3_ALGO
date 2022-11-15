public class FactoryTerrestre extends Factory {

    public FactoryTerrestre() {
    }

    public Vehicule creerVehicule(String lequel) {
        if (lequel == "Auto") { return (new T_Auto()); }
        else if (lequel == "Camion") { return (new T_Camion()); }
        else { return (new T_Moto()); }
    }

}
