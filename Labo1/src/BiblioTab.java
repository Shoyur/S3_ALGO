public class BiblioTab implements IBibliotheque {

    final int MAX = 20;
    Ouvrage biblioTab[] = new Ouvrage [MAX];
    int cote = 0;

    @Override
    public String ajouter(Ouvrage objOuvrage) {
        String reponse = "Désolé, la bibliothèque est pleine avec un maximum de " + MAX + " ouvrages.";
        if (cote < MAX) {
            biblioTab[cote++] = objOuvrage;
            return "Ouvrage no." + objOuvrage.getCote() + " ajouté avec succès.";
        }
        return reponse;
    }

    @Override
    public String supprimer(int coteDemande) {
        String resultat = "Il n'existe pas d'ouvrage avec la cote " + coteDemande + "...";
        for (int i = 0; i <= cote; i++) {
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
    public String rechercher(int coteDemande) {
        String resultat = "Il n'existe pas d'ouvrage avec la cote " + coteDemande + "...";
        for (int i = 0; i <= cote; i++) {
            if (biblioTab[i].getCote() == coteDemande) {
                resultat = biblioTab[i].toString();
                break;
            }
        }
        return resultat;
    }

    @Override
    public String toString() {
        String resultat = "La bibliothèque contient " + cote + " ouvrage et les voici :\n";
        for (int i = 0; i <= cote; i++) {
            resultat += biblioTab[i] + "\n";
        }
        return resultat;
    }
}
