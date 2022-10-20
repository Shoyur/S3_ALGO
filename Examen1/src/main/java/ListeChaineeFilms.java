public class ListeChaineeFilms extends ListeChainee {

    ListeChaineeFilms(){
        super();
    }

    public void modifierTitre(Film leFilm, String titre) {
        Noeud pt = GestionFilms.listeFilms.rechercher(leFilm);
        if (pt == null) {
            System.out.println("\nFilm inexistant!");
        } else {
          ((Film)  pt.obj).setTitre(titre);
        }
    }

    public Film chercherFilmParNumero(int numTrouver) {
        ListeChaineeFilms listeFilms = GestionFilms.listeFilms;
        Noeud pt = listeFilms.tete;
        boolean trouve = false;
        while (pt != null && !trouve){
            if (((Film)  pt.obj).getNum() == numTrouver) {
                trouve = true;
            } else {
                pt = pt.suiv;
            }
        }
        if (trouve) {
            return ((Film)  pt.obj);
        } else {
            return null;
        }
    }

}
