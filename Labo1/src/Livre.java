import java.util.Date;

public class Livre extends Ouvrage {

    private String auteur;
    private String titre;
    private String editeur;

    Livre() {}

    Livre(Date dateEmprunt, int cote, String auteur, String titre, String editeur) {
        super(dateEmprunt, cote);
        this.auteur = auteur;
        this.titre = titre;
        this.editeur = editeur;
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

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public String toString() {
        return super.toString() + ", (Auteur: " + this.auteur + "), (Titre: " + this.titre + "), (Éditeur: " + this.editeur + ").";
    }

}
