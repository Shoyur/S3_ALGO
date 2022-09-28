public class Noeud {

    Object obj;
    Noeud suiv;
    Noeud prec;

    public Noeud() {
        this.obj = null;
        this.suiv = null;
        this.prec = null;
    }

    public Noeud(Object obj) {
        this.obj = obj;
        this.suiv = null;
        this.prec = null;
    }

}
