public class FactoryMaritime extends Factory {

    public FactoryMaritime() {
    }

    public Vehicule creerVehicule(String lequel) {
        if (lequel == "Motomarine") { return (new M_Motomarine()); }
        else if (lequel == "Navire") { return (new M_Navire()); }
        else { return (new M_Voilier()); }
    }

}
