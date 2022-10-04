import java.util.Date;

public class CD extends Ouvrage {

    private String auteur;
    private String titre;

    CD () {}

    CD (Date dateEmprunt, int cote, String auteur, String titre) {
        super(dateEmprunt, cote);
        this.auteur = auteur;
        this.titre = titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String toString() {
        return super.toString() + "\nAuteur : (" + this.auteur + "),\nTitre : (" + this.titre + ").\n";
    }

}
