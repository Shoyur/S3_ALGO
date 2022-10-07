import java.util.Date;

public abstract class GestionBibliotheque {

    public static void main(String[] args) throws Exception {

        BiblioTab biblioTab = new BiblioTab();
        int biblioCote = 0;
        BiblioList biblioList = new BiblioList();
        BiblioListPerso biblioListPerso = new BiblioListPerso();

        Periodique uneRevue1 = new Periodique(new Date(), biblioCote++, "Potins et Bigoudis", 22, 24);
        biblioTab.ajouter(uneRevue1);
        // System.out.println(biblioTab.rechercher(0));
        biblioList.ajouter(uneRevue1);
        biblioListPerso.ajouter(uneRevue1);
        Periodique uneRevue2 = new Periodique(new Date(), biblioCote++, "Urbania", 111, 6);
        biblioTab.ajouter(uneRevue2);
        biblioList.ajouter(uneRevue2);
        biblioListPerso.ajouter(uneRevue2);
        Periodique uneRevue3 = new Periodique(new Date(), biblioCote++, "Elle Québec", 22, 12);
        biblioTab.ajouter(uneRevue3);
        biblioList.ajouter(uneRevue3);
        biblioListPerso.ajouter(uneRevue3);
        CD unDisque1 = new CD(new Date(), biblioCote++, "Mariah Carey", "Music Box");
        biblioTab.ajouter(unDisque1);
        biblioList.ajouter(unDisque1);
        biblioListPerso.ajouter(unDisque1);
        CD unDisque2 = new CD(new Date(), biblioCote++, "Pink Floyd", "THE DARK SIDE OF THE MOON");
        biblioTab.ajouter(unDisque2);
        biblioList.ajouter(unDisque2);
        biblioListPerso.ajouter(unDisque2);
        CD unDisque3 = new CD(new Date(), biblioCote++, "Michael Jackson", "THRILLER");
        biblioTab.ajouter(unDisque3);
        biblioList.ajouter(unDisque3);
        biblioListPerso.ajouter(unDisque3);
        Livre unLivre1 = new Livre(new Date(), biblioCote++, "Albert Camus", "L'Étranger", "Gallimard");
        biblioTab.ajouter(unLivre1);
        biblioList.ajouter(unLivre1);
        biblioListPerso.ajouter(unLivre1);
        Livre unLivre2 = new Livre(new Date(), biblioCote++, "Paul Celan", "Les poèmes", "Flammarion");
        biblioTab.ajouter(unLivre2);
        biblioList.ajouter(unLivre2);
        biblioListPerso.ajouter(unLivre2);
        Livre unLivre3 = new Livre(new Date(), biblioCote++, "Louis-Ferdinand Céline", "Voyage au bout de la nuit", "Milan");
        biblioTab.ajouter(unLivre3);
        biblioList.ajouter(unLivre3);
        biblioListPerso.ajouter(unLivre3);

        System.out.println(biblioTab.rechercher(5));
        // System.out.println(biblioList.rechercher(5));
        // System.out.println(biblioListPerso.rechercher(5));
        // // System.out.println("Voici toute la bibliothèque BiblioListPerso :");
        // // System.out.println(biblioListPerso);
        // System.out.println(biblioListPerso.rechercher(15));

    }
}
