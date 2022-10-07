public class ListeChaineePerso implements IListeChaineePerso {

    Noeud tete;
    Noeud queue;
    int taille;

    ListeChaineePerso() {
        this.tete = null;
        this.queue = null;
        this.taille = 0;
    }

    @Override
    public void ajouter(Ouvrage obj) {
        Noeud unNoeud = new Noeud(obj);
        if (this.tete == null) { 
            this.tete = this.queue = unNoeud; 
        }
        else {
            this.queue.suiv = unNoeud;
            unNoeud.prec = this.queue;
            this.queue = unNoeud;
        }
        this.taille++;
    }

    @Override
    public void supprimer(int cote) {
        Noeud pt = rechercher(cote);
        // Si la liste ne contient rien :
        if (pt == null) { 
            System.out.println("Objet introuvable"); 
        }
        // Si on supprimer le premier noeud :
        else if (pt == this.tete) {
            this.tete = this.tete.suiv;
        }
        // Si on supprimer le dernier noeud :
        else if (pt == this.queue) {
            pt.prec.suiv = pt.suiv; }
        else {
            pt.prec.suiv = pt.suiv;
            pt.suiv.prec = pt.prec;
        }
        this.taille--;
    }

    @Override
    public Noeud rechercher(int cote) {
        Noeud pt = this.tete;
        while (pt != null) {
            if (pt.obj.getCote() == cote) { return pt; }
            else { pt = pt.suiv; }
        }
        return pt;
    }

    @Override
    public String toString() {
        String resultat = "La bibliothèque contient " + this.taille + " objets et les voici :\n";
        Noeud pt = this.tete;
        while (pt != null) {
            resultat += pt.obj + "\n";
            pt = pt.suiv;
        }
        return resultat;
    }
}
