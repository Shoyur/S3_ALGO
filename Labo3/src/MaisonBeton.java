public class MaisonBeton extends Maison {

    public MaisonBeton(EtageBeton etageBeton, MursBeton mursBeton, ToitBeton toitBeton) {
        super(etageBeton, mursBeton, toitBeton);
        System.out.println(this.getRepresentation());
    }

    public String getRepresentation() {
        return super.getRepresentation() + " en béton.";
    }

}
