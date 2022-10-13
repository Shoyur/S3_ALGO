public class BiblioTab implements IBibliotheque {

    final int MAX = 20;
    Ouvrage biblioTab[] = new Ouvrage [MAX];
    int cote = 0;

    @Override
    public String ajouter(Ouvrage objOuvrage) { // O(1) car n'entre même pas dans une boucle. Le pire cas toujours N car...
        String reponse = "Désolé, la bibliothèque est pleine avec un maximum de " + MAX + " ouvrages.";
        if (cote < MAX) {
            biblioTab[cote++] = objOuvrage;
            return "Ouvrage no." + objOuvrage.getCote() + " ajouté avec succès.";
        }
        return reponse;
    }

    @Override
    public String supprimer(int coteDemande) { // O(N) car entre dans un while.
        String resultat = "Il n'existe pas d'ouvrage avec la cote " + coteDemande + "...";
        for (int i = 0; i < cote; i++) {
            if (biblioTab[i].getCote() == coteDemande) {
                biblioTab[i] = null;
                cote--;
                resultat = "Ouvrage no." + coteDemande + " supprimé avec succès.";
                break;
            }
        }
        return resultat;
    }

    @Override
    public String rechercher(int coteDemande) { // O(N) car entre dans un while.
        String resultat = "Il n'existe pas d'ouvrage avec la cote " + coteDemande + "...";
        for (int i = 0; i < cote; i++) {
            // System.out.println("Test: " + biblioTab[i].getCote());
            if (biblioTab[i].getCote() == coteDemande) {
                resultat = biblioTab[i].toString();
                break;
            }
        }
        return resultat;
    }

    @Override
    public String toString() { // O(N) car entre dans un while.
        String resultat = "La bibliothèque contient " + cote + " ouvrages et les voici :";
        for (int i = 0; i < cote; i++) {
            if (biblioTab[i] != null) { 
                resultat += "\n" + biblioTab[i]; 
            }
        }
        return resultat;
    }
}
