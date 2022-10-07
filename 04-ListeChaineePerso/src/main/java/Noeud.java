public class Noeud {

    Noeud suiv;
    Object obj;
    Noeud prec;

    Noeud () {
        this.suiv = null;
        this.obj = null;
        this.prec = null;
    }

    Noeud (Object obj) {
        this.suiv = null;
        this.prec = null;
        this.obj = obj;
    }
}