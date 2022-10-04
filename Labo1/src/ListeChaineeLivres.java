public class ListeChaineeLivres extends ListeChainee {
    ListeChaineeLivres(){
        super();
    }

    public void modifierTitre(Livre leLivre, String titre){
        Noeud pt = BiblioListPerso.listeLivres.rechercher(leLivre);
        if(pt == null){
            System.out.println("\nLivre inexistant!");
        }else {
          ((Livre)  pt.obj).setTitre(titre);
        }
    }

    public Livre chercherLivreParTitre(String titreTrouver){
        ListeChaineeLivres listeLivres = BiblioListPerso.listeLivres;
        Noeud pt = listeLivres.tete;
        boolean trouve = false;
        while(pt != null && !trouve){
            if(((Livre)  pt.obj).getTitre() == titreTrouver){
                trouve = true;
            } else{
                pt = pt.suiv;
            }
        }
        if (trouve){
            return ((Livre)  pt.obj);
        }else {
            return null;
        }
    }
}
