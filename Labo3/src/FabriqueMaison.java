public class FabriqueMaison {

    Maison maison;
    Monteur monteurMaison;

    public FabriqueMaison(String type) {
        if (type == "bois") {
            maison = new MaisonBois(new EtageBois(), new MursBois(), new ToitBois());
            monteurMaison = new MonteurBois(maison);
        }
        else if (type == "beton") {
            maison = new MaisonBeton(new EtageBeton(), new MursBeton(), new ToitBeton());
            monteurMaison = new MonteurBeton(maison);
        }
    }

}
