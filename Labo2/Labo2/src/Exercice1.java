import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

// Exercice 1
// Dans le document sur la récursivité nous avons parlé des tours de Hanoï. Vous pouvez lire sur ce sujet dans
// internet.
// À faire
//  Implanter cet algorithme Java (classe Exercice1)
//  Tester votre algorithme sur plusieurs exemplaires
//  Faire l’analyse asymptotique de votre algorithme

// https://www.mathsisfun.com/games/towerofhanoi.html

public class Exercice1 {

    private static LinkedList<Integer> tour1 = new LinkedList<Integer>();
    private static LinkedList<Integer> tour2 = new LinkedList<Integer>();
    private static LinkedList<Integer> tour3 = new LinkedList<Integer>();
    private static LinkedList[] quelTour = { tour1, tour2, tour3 };

    public static void jouer(int qteDisques) {

        if (qteDisques < 3) { System.out.println("Il faut jouer avec au moins 3 disques!"); return; }

        for (int i = 0; i < qteDisques; i++) { tour1.addLast(qteDisques-i); }
        afficher(); // seulement pour test !!!
        
        int tour = 0;
        int max = (int)Math.pow(2, qteDisques)-1;
        int s1, s2;
        if (qteDisques % 2 == 0) { s1 = 1; s2 = 2; }
        else { s1 = 2; s2 = 1; }
        
        while (true) {
            echanger(0, s1);
            if (++tour == max) { return; }
            echanger(0, s2);
            if (++tour == max) { return; }
            echanger(1, 2);
            if (++tour == max) { return; }
        }

    }

    private static void echanger(int t1, int t2) {
        if (quelTour[t1].isEmpty()) { quelTour[t1].addLast(quelTour[t2].removeLast()); }
        else if (quelTour[t2].isEmpty()) { quelTour[t2].addLast(quelTour[t1].removeLast()); }
        else if (getLast(t1) > getLast(t2)) { quelTour[t1].addLast(quelTour[t2].removeLast()); }
        else if (getLast(t1) < getLast(t2)) { quelTour[t2].addLast(quelTour[t1].removeLast()); }
        afficher();
    }

    private static int getLast(int t) {
        if (quelTour[t].isEmpty()) { return 0; }
        else { return (int)quelTour[t].getLast(); }
    }

    private static void afficher() {
        System.out.println(" T1 | " + tour1);
        System.out.println(" T2 | " + tour2);
        System.out.println(" T3 | " + tour3);
        System.out.println("-----------------------------------------");
    }
    
}
