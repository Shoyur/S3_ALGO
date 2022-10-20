public class GestionFilms {

    static ListeChaineeFilms listeFilms = new ListeChaineeFilms();

    public static void main(String[] args) throws Exception {

        // J'ai une méthode chargerListeFilms() mais ca devenait compliqué d'utiliser
        // ces objets dans le main ensuite, alors je les ai tous mis directement ici :

        Film unFilm1 = new Film(100,"Titre du film #1", "Réalisateur #1", 111);
        listeFilms.ajouter(unFilm1);
        Film unFilm2 = new Film(200,"Titre du film #2", "Réalisateur #2", 122);
        listeFilms.ajouter(unFilm2);
        Film unFilm3 = new Film(300,"Titre du film #3", "Réalisateur #3", 133);
        listeFilms.ajouter(unFilm3);
        Film unFilm4 = new Film(400,"Titre du film #4", "Réalisateur #4", 144);
        listeFilms.ajouter(unFilm4);
        Film unFilm5 = new Film(500,"Titre du film #5", "Réalisateur #5", 155);
        listeFilms.ajouter(unFilm5);
        System.out.println("====================================================================");
        lister();
        supprimer(200);
        System.out.println("====================================================================");
        modifier(300, "Nouveau titre pour film #3");
        System.out.println("====================================================================");
        lister();
        System.out.println("====================================================================");
        System.out.println("L'index du unFilm1 est : " + listeFilms.positionDe(unFilm1));
        System.out.println("L'index du unFilm2 est : " + listeFilms.positionDe(unFilm2));
        System.out.println("L'index du unFilm3 est : " + listeFilms.positionDe(unFilm3));
        System.out.println("L'index du unFilm4 est : " + listeFilms.positionDe(unFilm4));
        System.out.println("L'index du unFilm5 est : " + listeFilms.positionDe(unFilm5));
        System.out.println("L'index du ...null est : " + listeFilms.positionDe(null));
        System.out.println("====================================================================");
        System.out.println(listeFilms.trouver(unFilm3));

    }

    private static void chargerListeFilms() {
        Film unFilm1 = new Film(100,"Titre du film #1", "Réalisateur #1", 111);
        listeFilms.ajouter(unFilm1);
        Film unFilm2 = new Film(200,"Titre du film #2", "Réalisateur #2", 122);
        listeFilms.ajouter(unFilm2);
        Film unFilm3 = new Film(300,"Titre du film #3", "Réalisateur #3", 133);
        listeFilms.ajouter(unFilm3);
        Film unFilm4 = new Film(400,"Titre du film #4", "Réalisateur #4", 144);
        listeFilms.ajouter(unFilm4);
        Film unFilm5 = new Film(500,"Titre du film #5", "Réalisateur #5", 155);
        listeFilms.ajouter(unFilm5);
    }

    private static void lister() {
        listeFilms.afficher();
    }
    
    private static void supprimer(int num) {
        Film unFilm = listeFilms.chercherFilmParNumero(num);
        if (unFilm == null) {
            System.out.println("Le Film est introuvable");
            return;
        }
        listeFilms.supprimer(unFilm);
    }

    private static void modifier(int num, String nouveauTitre) {
        Film unFilm = listeFilms.chercherFilmParNumero(num);
        listeFilms.modifierTitre(unFilm, nouveauTitre);
    }

}