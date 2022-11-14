// Exercice 3 (patrons de conception)
// À faire
//  Vous allez utiliser le patron de conception Fabrique (Factory) abstraite pour représenter le cas suivant :
// Représentation de véhicules dont ceux-ci peuvent être terrestres, maritimes et aériens. Par exemple les
// véhicules terrestres peuvent être des autos, camions, motos et bicyclettes
//  Vous allez implanter ce patron de conception en Java
//  Faire les tests nécessaires


public abstract class Factory {

    public static int typeDeVehicule(String typeDeVehicule) {
        if (typeDeVehicule.equals("Aérien")) { return 0; }
        else if (typeDeVehicule.equals("Maritime")) { return 1; }
        else { return 3; }
    }

    public static Factory getFactory() {
        int type = typeDeVehicule("Terrestre");
        if (type == 0) { return (new FactoryAerien()); }
        else if (type == 1) { return (new FactoryMaritime()); }
        else { return (new FactoryTerrestre()); }
    }

    public abstract Vehicule creerVehicule();
}
