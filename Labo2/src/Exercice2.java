import java.util.Arrays;
import java.util.Random;

// Exercice 2
// À faire
//  Faire un programme Java pour implanter un algorithme de tri (de votre choix) de façon récursive
//  Faire l’analyse asymptotique de votre algorithme
//  Implanter cet algorithme Java (classe Exercice2)

public class Exercice2 {

    public static int iTrier;

    public static void trier(int combien) {
        int[] liste = new int[combien];
        Random random = new Random();
        for (int i = 0; i < combien; i++) {
            liste[i] = random.nextInt(100) + 1;
        }
        System.out.println("La liste random = " + Arrays.toString(liste));
        System.out.println("La liste triée  = " + Arrays.toString(trier(liste, (int)Math.pow(combien - 1, 2))));
        
    }

    // 
    public static int[] trier(int[] liste, int i) {
        int index = (i % (liste.length - 1));
        if (liste[index] > liste[index + 1]) {
            int temp = liste[index];
            liste[index] = liste[index + 1];
            liste[index+1] = temp;
        }
        if (i > 0) { trier(liste, i - 1); } // analyse big-O : O(n^2) ou plutôt O((n-1)^2)
        return liste;
    }
    
}