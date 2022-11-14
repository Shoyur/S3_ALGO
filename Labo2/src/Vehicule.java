import java.util.Date;

// Exercice 3 (patrons de conception)
// À faire
//  Vous allez utiliser le patron de conception Fabrique (Factory) abstraite pour représenter le cas suivant :
// Représentation de véhicules dont ceux-ci peuvent être terrestres, maritimes et aériens. Par exemple les
// véhicules terrestres peuvent être des autos, camions, motos et bicyclettes
//  Vous allez implanter ce patron de conception en Java
//  Faire les tests nécessaires

public abstract class Vehicule {

    private int numeroSerie;
    private String fabricant;
    private Date dateFabrication;

    public Vehicule(int numeroSerie, String fabricant, Date dateFabrication) {
        this.numeroSerie = numeroSerie;
        this.fabricant = fabricant;
        this.dateFabrication = dateFabrication;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricant() {
        return fabricant;
    }

    public void setFabricant(String fabricant) {
        this.fabricant = fabricant;
    }

    public Date getDateFabrication() {
        return dateFabrication;
    }

    public void setDateFabrication(Date dateFabrication) {
        this.dateFabrication = dateFabrication;
    }

    public Vehicule clone() {
        try {
            Vehicule copie = (Vehicule) super.clone();
            return copie;
        } 
        catch (CloneNotSupportedException e) { return null; }
    }
    
}
