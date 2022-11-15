public abstract class Factory {

    // public static int typeDeVehicule(String typeDeVehicule) {
    //     if (typeDeVehicule.equals("Aérien")) { return 0; }
    //     else if (typeDeVehicule.equals("Maritime")) { return 1; }
    //     else { return 3; }
    // }

    public static Factory getFactory(String type) {
        if (type == "Aerien") { return (new FactoryAerien()); }
        else if (type == "Maritime") { return (new FactoryMaritime()); }
        else { return (new FactoryTerrestre()); }
    }

    public abstract Vehicule creerVehicule(String lequel);
}
