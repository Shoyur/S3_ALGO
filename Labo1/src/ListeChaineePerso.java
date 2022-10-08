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
    public boolean ajouter(Ouvrage obj) {
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
        return true;
    }

    @Override
    public boolean supprimer(int cote) {
        Noeud pt = rechercher(cote);
        if (pt == null) { return false; }
        else if (pt == this.tete) { this.tete = this.tete.suiv; }
        else if (pt == this.queue) { pt.prec.suiv = pt.suiv; }
        else {
            pt.prec.suiv = pt.suiv;
            pt.suiv.prec = pt.prec;
        }
        this.taille--;
        return true;
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
        String resultat = "La bibliothèque contient " + this.taille + " ouvrages et les voici :";
        Noeud pt = this.tete;
        while (pt != null) {
            resultat += "\n" + pt.obj;
            pt = pt.suiv;
        }
        return resultat;
    }
}
