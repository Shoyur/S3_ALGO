import java.util.Date;

public class BiblioTab extends ListeChaineeLivres {

    private static int cote = 0;

    private static Ouvrage biblioTab[];
    public static void main(String[] args) throws Exception {
        biblioTab = new Ouvrage [20];
        Periodique uneRevue1 = new Periodique(new Date(), ++cote, "Potins et Bigoudis", 22, 24);
        Periodique uneRevue2 = new Periodique(new Date(), ++cote, "Urbania", 111, 6);
        Periodique uneRevue3 = new Periodique(new Date(), ++cote, "Elle Québec", 22, 12);
        Periodique uneRevue4 = new Periodique(new Date(), ++cote, "Magazine Véro", 22, 12);
        Periodique uneRevue5 = new Periodique(new Date(), ++cote, "Cook it", 5, 4);
        biblioTab[0] = uneRevue1;
        biblioTab[1] = uneRevue2;
        biblioTab[2] = uneRevue3;
        biblioTab[3] = uneRevue4;
        biblioTab[4] = uneRevue5;
        CD unDisque1 = new CD(new Date(), ++cote, "Mariah Carey", "Music Box");
        CD unDisque2 = new CD(new Date(), ++cote, "Pink Floyd", "THE DARK SIDE OF THE MOON");
        CD unDisque3 = new CD(new Date(), ++cote, "Michael Jackson", "THRILLER");
        CD unDisque4 = new CD(new Date(), ++cote, "AC/DC", "Back in Black");
        CD unDisque5 = new CD(new Date(), ++cote, "Whitney Houston", "The Bodyguard");
        biblioTab[5] = unDisque1;
        biblioTab[6] = unDisque2;
        biblioTab[7] = unDisque3;
        biblioTab[8] = unDisque4;
        biblioTab[9] = unDisque5;
        Livre unLivre1 = new Livre(new Date(), ++cote, "Albert Camus", "L'Étranger", "Gallimard");
        Livre unLivre2 = new Livre(new Date(), ++cote, "Paul Celan", "Les poèmes", "Flammarion");
        Livre unLivre3 = new Livre(new Date(), ++cote, "Louis-Ferdinand Céline", "Voyage au bout de la nuit", "Milan");
        Livre unLivre4 = new Livre(new Date(), ++cote, "Miguel de Cervantes", "Don Quichotte", "Baudelaire");
        Livre unLivre5 = new Livre(new Date(), ++cote, "Luciphère", "La Bible", "Les Nazis");
        biblioTab[10] = unLivre1;
        biblioTab[11] = unLivre2;
        biblioTab[12] = unLivre3;
        biblioTab[13] = unLivre4;
        biblioTab[14] = unLivre5;

        System.out.println("Les informations de uneRevue1 est :\n" + uneRevue1);
    }



    BiblioTab () {}
    
    // public String toString() {
        // String string = "La bibliothèque contient " + ListeChaineeLivres.cote + " ouvrages.\r";

        // TODO !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // for (i in BiblioTab) { 
        //     string += this.toString() + "\r"; 
        // }

        // return string;
    // }

}
