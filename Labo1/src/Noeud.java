public class Noeud {

    Object obj;
    Noeud suiv;
    Noeud prec;

    Noeud() {
        this.obj = null;
        this.suiv = null;
        this.prec = null;
    }

    Noeud(Object infos) {
        this.obj = infos;
        this.suiv = null;
        this.prec = null;
    }
}