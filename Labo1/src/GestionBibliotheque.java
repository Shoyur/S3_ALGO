import java.util.Date;

public abstract class GestionBibliotheque {

    public static void main(String[] args) throws Exception {

        BiblioTab biblioTab = new BiblioTab();
        int biblioCote = 0;
        BiblioList biblioList = new BiblioList();
        BiblioListPerso biblioListPerso = new BiblioListPerso();

        Periodique uneRevue1 = new Periodique(new Date(), biblioCote++, "Potins et Bigoudis", 22, 24);
        System.out.println(biblioTab.ajouter(uneRevue1));
        System.out.println(biblioList.ajouter(uneRevue1));
        System.out.println(biblioListPerso.ajouter(uneRevue1));
        Periodique uneRevue2 = new Periodique(new Date(), biblioCote++, "Urbania", 111, 6);
        System.out.println(biblioTab.ajouter(uneRevue2));
        System.out.println(biblioList.ajouter(uneRevue2));
        System.out.println(biblioListPerso.ajouter(uneRevue2));
        Periodique uneRevue3 = new Periodique(new Date(), biblioCote++, "Elle Québec", 22, 12);
        System.out.println(biblioTab.ajouter(uneRevue3));
        System.out.println(biblioList.ajouter(uneRevue3));
        System.out.println(biblioListPerso.ajouter(uneRevue3));
        CD unDisque1 = new CD(new Date(), biblioCote++, "Mariah Carey", "Music Box");
        System.out.println(biblioTab.ajouter(unDisque1));
        System.out.println(biblioList.ajouter(unDisque1));
        System.out.println(biblioListPerso.ajouter(unDisque1));
        CD unDisque2 = new CD(new Date(), biblioCote++, "Pink Floyd", "THE DARK SIDE OF THE MOON");
        System.out.println(biblioTab.ajouter(unDisque2));
        System.out.println(biblioList.ajouter(unDisque2));
        System.out.println(biblioListPerso.ajouter(unDisque2));
        CD unDisque3 = new CD(new Date(), biblioCote++, "Michael Jackson", "THRILLER");
        System.out.println(biblioTab.ajouter(unDisque3));
        System.out.println(biblioList.ajouter(unDisque3));
        System.out.println(biblioListPerso.ajouter(unDisque3));
        Livre unLivre1 = new Livre(new Date(), biblioCote++, "Albert Camus", "L'Étranger", "Gallimard");
        System.out.println(biblioTab.ajouter(unLivre1));
        System.out.println(biblioList.ajouter(unLivre1));
        System.out.println(biblioListPerso.ajouter(unLivre1));
        Livre unLivre2 = new Livre(new Date(), biblioCote++, "Paul Celan", "Les poèmes", "Flammarion");
        System.out.println(biblioTab.ajouter(unLivre2));
        System.out.println(biblioList.ajouter(unLivre2));
        System.out.println(biblioListPerso.ajouter(unLivre2));
        Livre unLivre3 = new Livre(new Date(), biblioCote++, "Louis-Ferdinand Céline", "Voyage au bout de la nuit", "Milan");
        System.out.println(biblioTab.ajouter(unLivre3));
        System.out.println(biblioList.ajouter(unLivre3));
        System.out.println(biblioListPerso.ajouter(unLivre3));

        System.out.println(biblioTab.rechercher(8));
        System.out.println(biblioList.rechercher(8));
        System.out.println(biblioListPerso.rechercher(8));
        System.out.println(biblioTab.rechercher(9));
        System.out.println(biblioList.rechercher(9));
        System.out.println(biblioListPerso.rechercher(9));

        System.out.println(biblioTab);
        System.out.println(biblioList);
        System.out.println(biblioListPerso);

        System.out.println(biblioTab.supprimer(3));
        System.out.println(biblioTab);

        System.out.println(biblioList.supprimer(3));
        System.out.println(biblioList);

        System.out.println(biblioListPerso.supprimer(0));
        System.out.println(biblioListPerso.supprimer(0));
        System.out.println(biblioListPerso.supprimer(3));
        System.out.println(biblioListPerso.supprimer(8));
        System.out.println(biblioListPerso);

    }
}
