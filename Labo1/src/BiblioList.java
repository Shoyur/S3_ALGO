import java.util.*;

public class BiblioList implements IBibliotheque {

    LinkedList<Ouvrage> biblioList = new LinkedList<>();
    int cote = 0;

    @Override
    public String ajouter(Ouvrage objOuvrage) {
        biblioList.add(objOuvrage);
        cote++;
        return "Ouvrage no." + objOuvrage.getCote() + " ajouté avec succès.";
    }

    @Override
    public String supprimer(int coteDemande) {
        String resultat = "Il n'existe pas d'ouvrage avec le no." + coteDemande + "...";
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == coteDemande) {
                biblioList.remove(i);
                cote--;
                resultat = "Ouvrage no." + coteDemande + " supprimé avec succès.";
                break;
            }
        }
        return resultat;
    }

    @Override
    public String rechercher(int coteDemande) {
        String resultat = "Il n'existe pas d'ouvrage avec le no." + coteDemande + "...";
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == coteDemande) {
                resultat = biblioList.get(i).toString();
            }
        }
        return resultat;
    }

    @Override
    public String toString() {
        String resultat = "La bibliothèque contient " + cote + " ouvrages et les voici :\n";
        for (int i = 0; i < biblioList.size(); i++) {
            resultat += biblioList.get(i) + "\n";
        }
        return resultat;
    }
}
