// Exercice 3 (patrons de conception)
// À faire
//  Vous allez utiliser le patron de conception Fabrique (Factory) abstraite pour représenter le cas suivant :
// Représentation de véhicules dont ceux-ci peuvent être terrestres, maritimes et aériens. Par exemple les
// véhicules terrestres peuvent être des autos, camions, motos et bicyclettes
//  Vous allez implanter ce patron de conception en Java
//  Faire les tests nécessaires

public class Exercice3 {

    public static void go() {
        Factory UsineAerienne = Factory.getFactory("Aerien");
        Vehicule unVehicule = UsineAerienne.creerVehicule("Avion");
        unVehicule.setVitesseKM(2000);
        // unVehicule.setAltitudeMaxM(2000);
        unVehicule.voyager();
    }
    
}