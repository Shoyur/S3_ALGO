public class BiblioListPerso implements IBibliotheque {

    ListeChaineePerso biblioListPerso = new ListeChaineePerso();

    @Override
    public String ajouter(Ouvrage objOuvrage) { // O(1) car n'entre même pas dans une boucle.
        String reponse = "Désolé, l'ouvrage n'a pas été ajouté'";
        if (biblioListPerso.ajouter(objOuvrage)) {
            reponse = "Ouvrage no." + objOuvrage.getCote() + " ajouté avec succès.";
        }
        return reponse;
    }

    @Override
    public String supprimer(int coteDemande) { // O(N) car entre dans le while de rechercher().
        String resultat = "Il n'existe pas d'ouvrage avec le no." + coteDemande + "...";
        if (biblioListPerso.supprimer(coteDemande)) { 
            resultat = "Ouvrage no." + coteDemande + " supprimé avec succès."; 
        }
        return resultat;
    }

    @Override
    public String rechercher(int coteDemande) { // O(N) car entre dans un while.
        String resultat = "Il n'existe pas d'ouvrage avec la cote " + coteDemande + "...";
        Noeud pt = biblioListPerso.rechercher(coteDemande);
        if (pt != null) {
            resultat = pt.obj.toString();
        }
        return resultat;
    }
    
    @Override
    public String toString() {
        return biblioListPerso.toString();
    }
}
