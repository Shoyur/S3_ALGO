public class ListeChainee implements IListeChainee {

    Noeud tete;
    Noeud queue;
    int taille;

    public ListeChainee() {
        this.tete = null;
        this.queue = null;
        this.taille = 0;
    }

    @Override
    public void ajouter(Object obj) {
        Noeud unNoeud = new Noeud(obj);
        if (this.tete == null) { // Autrement dit, si la liste est vide.
            this.tete = unNoeud;
            this.queue = unNoeud;
        }
        else {
            this.queue.suiv = unNoeud;
            unNoeud.prec = this.queue;
            this.queue = unNoeud;
        }
        
    }

    @Override
    public void supprimer(Object obj) {
        Noeud posNoeud = rechercher(obj);
        Noeud precPosNoeud;
        if (posNoeud == null) {
            System.out.println("Noeud introuvable...");
        }
        else if (posNoeud.prec != null) {
            precPosNoeud = posNoeud.prec;
            precPosNoeud.suiv = posNoeud.suiv;
            if (posNoeud.suiv != null) {
                posNoeud.suiv.prec = precPosNoeud;
            }
        }
    }

    @Override
    public Noeud rechercher(Object obj) {
        Noeud pt = tete;
        while (pt != null) {
            if (pt.obj == obj) { return pt; }
            else { pt = pt.suiv; }
        }
        return pt;
    }

    @Override
    public void lister(Noeud obj) {
        // TODO Auto-generated method stub
        
    }
    
}
