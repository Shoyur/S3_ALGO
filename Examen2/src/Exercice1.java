import java.util.Arrays;
import java.util.Random;

// Exercice 1
// Méthode min
// Trouver la valeur minimale dans un tableau à l'aide de la récursivité. La méthode reçoit
// minimalement en paramètre le tableau de nombre et possiblement autres paramètres
// et cela selon votre algorithme.

public class Exercice1 {

    private static int min;

    public static void main(String[] args) throws Exception {
        int[] liste = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            liste[i] = random.nextInt(100) + 1;
        }
        System.out.println("La liste random = " + Arrays.toString(liste));
        min = liste[0];
        System.out.println("Le plus petit nombre cette liste est : " + min(liste, 0));
    }

    public static int min(int[] liste, int i) {
        if (liste[i] < min) { min = liste[i]; }
        if (i < liste.length-1) { min(liste, i + 1); } // analyse big-O : O(n)
        return min;
    }
    
}