// Exercice 2
// Méthode exp
// Méthode récursive qui retourne la valeur d’une exponentielle baseexposant . Par
// exemple si base=2 et exposant=8 alors la méthode exp retournera 256.

public class Exercice2 {

    private static int valeur = 1;

    public static void main(String[] args) throws Exception {
        int exp = 8;
        System.out.println("2 exposant " + exp + " = " + exp(exp));
    }

    public static int exp(int exp) {
        if (exp == 0) { return 1; }
        valeur = valeur * 2;
        if (exp > 1) { exp(exp -1); } // analyse big-O : O(n)
        return valeur;
    }
    
}