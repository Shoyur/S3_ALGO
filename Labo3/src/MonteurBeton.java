public class MonteurBeton implements Monteur {

    Maison maison;

    public MonteurBeton(Maison maison) {
        this.maison = maison;
        this.construireEtage();
        this.construireMurs();
        this.construireToit();
    }

    @Override
    public void construireEtage() {
        System.out.println("Construction " + maison.getEtage().getRepresentation() + " terminé.");
        
    }

    @Override
    public void construireMurs() {
        System.out.println("Construction " + maison.getMurs().getRepresentation() + " terminé.");
        
    }

    @Override
    public void construireToit() {
        System.out.println("Construction " + maison.getToit().getRepresentation() + " terminé.");
        
    }
    
}
