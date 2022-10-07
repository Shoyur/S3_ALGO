public class Noeud {

    Noeud suiv;
    Noeud prec;
    Ouvrage obj;

    Noeud() {
        this.suiv = null;
        this.prec = null;
        this.obj = null;
    }

    Noeud(Ouvrage obj) {
        this.suiv = null;
        this.prec = null;
        this.obj = obj;
    }
}