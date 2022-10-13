import java.util.*;

public class BiblioList implements IBibliotheque {

    LinkedList<Ouvrage> biblioList = new LinkedList<>();

    @Override
    public String ajouter(Ouvrage objOuvrage) { // O(1) car n'entre même pas dans une boucle.
        String reponse = "Désolé, l'ouvrage n'a pas été ajouté'";
        if (biblioList.add(objOuvrage)) {
            reponse = "Ouvrage no." + objOuvrage.getCote() + " ajouté avec succès.";
        }
        return reponse;
    }

    @Override
    public String supprimer(int coteDemande) { // O(N) car entre dans un for, sauf que...
        String resultat = "Il n'existe pas d'ouvrage avec le no." + coteDemande + "...";
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == coteDemande) {
                biblioList.remove(i);
                resultat = "Ouvrage no." + coteDemande + " supprimé avec succès.";
                break;
            }
        }
        return resultat;
    }

    @Override
    public String rechercher(int coteDemande) { // O(N) car entre dans un for, sauf que...
        String resultat = "Il n'existe pas d'ouvrage avec la cote " + coteDemande + "...";
        for (int i = 0; i < biblioList.size(); i++) {
            if (biblioList.get(i).getCote() == coteDemande) {
                resultat = biblioList.get(i).toString();
            }
        }
        return resultat;
    }

    @Override
    public String toString() { // O(N) car entre dans un for, sauf que...
        String resultat = "La bibliothèque contient " + biblioList.size() + " ouvrages et les voici :";
        for (int i = 0; i < biblioList.size(); i++) {
            resultat += "\n" + biblioList.get(i);
        }
        return resultat;
    }
}
