import java.util.Date;

//

public class App {

    public static void main(String[] args) throws Exception {

        // System.out.println("Exécution de l'Exercice1.java :");
        // Exercice1.jouer(4);

        // System.out.println("Exécution de l'Exercice2.java :");
        // Exercice2.trier(10);

        System.out.println("Exécution de l'Exercice3.java :");
        F_M_Motomarine seadoo = new F_M_Motomarine(
            0101, 
            "Rotax", 
            new Date(), 
            "bleu et gris",
            true, 
            30, 
            2, 
            true, 
            3);
        Factory factory = new Factory(seadoo);
        for (int i = 0; i < 10; i++) {
             System.out.println(factory.faireVehicule());
        }
    }

}
