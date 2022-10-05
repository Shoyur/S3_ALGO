public class BiblioTab implements IBibliotheque {

    final int MAX = 20;
    Ouvrage biblioTab[] = new Ouvrage [20];
    int cote = 0;

    @Override
    public void ajouter(Ouvrage objOuvrage) {
        biblioTab[cote++] = objOuvrage;
    }

    @Override
    public void supprimer(int coteDemande) {
        for (int i = 0; i <= cote; i++) {
            if (biblioTab[i].getCote() == coteDemande) {
                biblioTab[i] = null;
                cote--;
                return;
            }
        }
    }

    @Override
    public String rechercher(int coteDemande) {
        String resultat = "L'ouvrage avec la cote no." + coteDemande + " n'existe pas.\n";
        int i;
        for (i = 0; i <= MAX; i++) {
            if (biblioTab[i].getCote() == coteDemande) {
                resultat = "L'ouvrage avec la cote no." + coteDemande + " existe, et le voici :\n";
                resultat += biblioTab[i] + "\n";
            }
        }
        return resultat;
    }

    @Override
    public String toString() {
        String resultat = "La bibliothèque contient " + cote + " objets et les voici :\n";
        for (int i = 0; i <= cote; i++) {
            resultat += biblioTab[i] + "\n";
        }
        return resultat;
    }
}
