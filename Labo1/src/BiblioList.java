import java.util.*;

public class BiblioList implements IBibliotheque {

    LinkedList<Ouvrage> biblioList = new LinkedList<>();
    int cote = 0;

    @Override
    public void ajouter(Ouvrage objOuvrage) {
        biblioList.add(objOuvrage);
        cote++;
    }

    @Override
    public void supprimer(int coteDemande) {
        biblioList.remove(objOuvrage);
        cote--;
    }

    @Override
    public String rechercher(int coteDemande) {
        if (biblioList.contains(objOuvrage)) {
            return objOuvrage;
        }
        else {
            return null;
        }
    }

    @Override
    public String toString() {
        String resultat = "La bibliothèque contient " + cote + " objets et les voici :\n";
        for (int i = 0; i < biblioList.size(); i++) {
            resultat += biblioList.get(i) + "\n";
        }
        return resultat;
    }
}
