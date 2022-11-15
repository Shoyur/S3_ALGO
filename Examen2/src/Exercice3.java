import java.util.Arrays;

// Exercice 3
// Méthode rechercheBinaire
// Vous connaissez déjà la méthode de recherche binaire, dont nous avons fait un exemple en
// classe. Vous allez résoudre le même problème mais en utilisant la récursivité.

public class Exercice3 {

    private static int[] tab = { 6, 33, 1, 17, 12, 8, 40, 50, 3, 2, 9, 65, 99, 7 };
    private static int tours = 0;
    private static int inf = 0;
    private static int sup = tab.length-1;
    private static int pivot;

    public static void main(String[] args) throws Exception {

        System.out.println("La liste avant = " + Arrays.toString(tab));
        Arrays.sort(tab);
        System.out.println("La liste après = " + Arrays.toString(tab));

        int elem = 40;
        int pos = rechercheBinaire(tab, elem);

        if (pos != -1) { 
            System.out.println("L'élément " + elem + " a été trouvé à la position " + pos + " après " + tours + " comparaison(s)!");
        }
        else {
            System.out.println("L'élément " + elem + " est introuvable, même après " + tours + " comparaison(s)!");
        }

    }

    public static int rechercheBinaire(int[] tab, int elem) {
        tours++;
        pivot = (int)Math.floor((inf + sup) / 2);
        if (elem == tab[pivot]) { return pivot; } 
        else if (elem > tab[pivot]){ inf = pivot + 1; } 
        else { sup = pivot - 1; }
        if (inf <= sup) { rechercheBinaire(tab, elem); }
        return pivot;
    }
    
}