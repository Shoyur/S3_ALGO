public class BiblioListPerso implements IBibliotheque {

    ListeChaineePerso listeLivres = new ListeChaineePerso();
    int cote = 0;

    @Override
    public String ajouter(Ouvrage objOuvrage) {
        listeLivres.ajouter(objOuvrage);
        cote++;
        return "Ouvrage no." + objOuvrage.getCote() + " ajouté avec succès.";
    }

    @Override
    public String supprimer(int coteDemande) {
        listeLivres.supprimer(coteDemande);
        cote--;
        return "Ouvrage no." + coteDemande + " supprimé avec succès.";
    }

    @Override
    public String rechercher(int coteDemande) {
        String resultat = "Il n'existe pas d'ouvrage avec la cote " + coteDemande + "...";
        Noeud pt = listeLivres.rechercher(coteDemande);
        if (pt != null) {
            resultat = pt.obj.toString();
        }
        return resultat;
    }
    
    @Override
    public String toString() {
        return listeLivres.toString();
    }
}
