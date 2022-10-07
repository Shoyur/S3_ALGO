import java.util.Date;

public class Periodique extends Ouvrage {

    private String nom;
    private int numero;
    private int periodicite;
    
    Periodique() {}

    Periodique(Date dateEmprunt, int cote, String nom, int numero, int periodicite) {
        super(dateEmprunt, cote);
        this.nom = nom;
        this.numero = numero;
        this.periodicite = periodicite;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getPeriodicite() {
        return periodicite;
    }

    public void setPeriodicite(int periodicite) {
        this.periodicite = periodicite;
    }

    public String toString() {
        return super.toString() + ", (Nom: " + this.nom + "), (Numéro: " + this.numero + "), (Sorties par année: " + this.periodicite + ").";
    }

}
