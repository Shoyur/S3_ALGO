import java.util.Date;

public class GestionBibliotheque {

    public static void main(String[] args) throws Exception {

        BiblioTab biblioTab = new BiblioTab();
        int biblioCote = 1;
        BiblioList biblioList = new BiblioList();
        BiblioListPerso biblioListPerso = new BiblioListPerso();

        Periodique uneRevue1 = new Periodique(new Date(), biblioCote++, "Potins et Bigoudis", 22, 24);
        biblioTab.ajouter(uneRevue1);
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
        Periodique uneRevue4 = new Periodique(new Date(), biblioCote++, "Magazine Véro", 22, 12);
        biblioTab.ajouter(uneRevue4);
        biblioList.ajouter(uneRevue4);
        biblioListPerso.ajouter(uneRevue4);
        Periodique uneRevue5 = new Periodique(new Date(), biblioCote++, "Cook it", 5, 4);
        biblioTab.ajouter(uneRevue5);
        biblioList.ajouter(uneRevue5);
        biblioListPerso.ajouter(uneRevue5);
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
        CD unDisque4 = new CD(new Date(), biblioCote++, "AC/DC", "Back in Black");
        biblioTab.ajouter(unDisque4);
        biblioList.ajouter(unDisque4);
        biblioListPerso.ajouter(unDisque4);
        CD unDisque5 = new CD(new Date(), biblioCote++, "Whitney Houston", "The Bodyguard");
        biblioTab.ajouter(unDisque5);
        biblioList.ajouter(unDisque5);
        biblioListPerso.ajouter(unDisque5);
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
        Livre unLivre4 = new Livre(new Date(), biblioCote++, "Miguel de Cervantes", "Don Quichotte", "Baudelaire");
        biblioTab.ajouter(unLivre4);
        biblioList.ajouter(unLivre4);
        biblioListPerso.ajouter(unLivre4);
        Livre unLivre5 = new Livre(new Date(), biblioCote++, "Luciphère", "La Bible", "Les Nazis");
        biblioTab.ajouter(unLivre5);
        biblioList.ajouter(unLivre5);
        biblioListPerso.ajouter(unLivre5);

        

    }
}
