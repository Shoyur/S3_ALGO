public class MaisonBois extends Maison {  

    public MaisonBois(EtageBois etageBois, MursBois mursBois, ToitBois toitBois) {
        super(etageBois, mursBois, toitBois);
        System.out.println(this.getRepresentation());
    }

    public String getRepresentation() {
        return super.getRepresentation() + " en bois.";
    }

}
