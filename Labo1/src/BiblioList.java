import java.util.*;

public class BiblioList extends ListeChaineeLivres {

    private static LinkedList<Ouvrage> biblioList = new LinkedList<>();
    private static int cote = 0;

    public static void main(String[] args) throws Exception {
        Periodique uneRevue1 = new Periodique(new Date(), ++cote, "Potins et Bigoudis", 22, 24);
        Periodique uneRevue2 = new Periodique(new Date(), ++cote, "Urbania", 111, 6);
        Periodique uneRevue3 = new Periodique(new Date(), ++cote, "Elle Québec", 22, 12);
        Periodique uneRevue4 = new Periodique(new Date(), ++cote, "Magazine Véro", 22, 12);
        Periodique uneRevue5 = new Periodique(new Date(), ++cote, "Cook it", 5, 4);
        biblioList.add(uneRevue1);
        biblioList.add(uneRevue2);
        biblioList.add(uneRevue3);
        biblioList.add(uneRevue4);
        biblioList.add(uneRevue5);
        CD unDisque1 = new CD(new Date(), ++cote, "Mariah Carey", "Music Box");
        CD unDisque2 = new CD(new Date(), ++cote, "Pink Floyd", "THE DARK SIDE OF THE MOON");
        CD unDisque3 = new CD(new Date(), ++cote, "Michael Jackson", "THRILLER");
        CD unDisque4 = new CD(new Date(), ++cote, "AC/DC", "Back in Black");
        CD unDisque5 = new CD(new Date(), ++cote, "Whitney Houston", "The Bodyguard");
        biblioList.add(unDisque1);
        biblioList.add(unDisque2);
        biblioList.add(unDisque3);
        biblioList.add(unDisque4);
        biblioList.add(unDisque5);
        Livre unLivre1 = new Livre(new Date(), ++cote, "Albert Camus", "L'Étranger", "Gallimard");
        Livre unLivre2 = new Livre(new Date(), ++cote, "Paul Celan", "Les poèmes", "Flammarion");
        Livre unLivre3 = new Livre(new Date(), ++cote, "Louis-Ferdinand Céline", "Voyage au bout de la nuit", "Milan");
        Livre unLivre4 = new Livre(new Date(), ++cote, "Miguel de Cervantes", "Don Quichotte", "Baudelaire");
        Livre unLivre5 = new Livre(new Date(), ++cote, "Luciphère", "La Bible", "Les Nazis");
        biblioList.add(unLivre1);
        biblioList.add(unLivre2);
        biblioList.add(unLivre3);
        biblioList.add(unLivre4);
        biblioList.add(unLivre5);

        System.out.println("Les informations de uneRevue1 est :\n" + uneRevue1);
    }

}
