import java.util.Date;

//

public class App {

    public static void main(String[] args) throws Exception {

        // System.out.println("Exécution de l'Exercice1.java :");
        // Exercice1.jouer(4);

        // System.out.println("Exécution de l'Exercice2.java :");
        // Exercice2.trier(10);

        // System.out.println("Exécution de l'Exercice3.java :");
        // Vehicule prototype = new M_Motomarine(
        //     0101, 
        //     "Rotax", 
        //     new Date(), 
        //     "bleu et gris",
        //     true, 
        //     30, 
        //     2, 
        //     true, 
        //     3);
        // Factory factory = new Factory(prototype);
        // for (int i = 0; i < 10; i++) {
        //      System.out.println(factory.faireVehicule());
        // }
        Factory aFactory = Factory.getFactory();
        Vehicule unVehicule = aFactory.creerVehicule();
        unVehicule.setCaption("Jouer");
        unVehicule.paint();
    }

}
