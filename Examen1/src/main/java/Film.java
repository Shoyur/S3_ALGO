public class Film {
    private int num;
    private String titre;
    private String res;


    private int duree;

    Film() {
        this.num = 0;
        this.titre = "";
        this.res = "";
        this.duree = 0;
    }

    Film(int  num, String titre, String res, int duree) {
        this.num = num;
        this.titre = titre;
        this.res = res;
        this.duree = duree;
    }

    public int getNum() {
        return this.num;
    }
    public String getTitre() {
        return this.titre;
    }
    public int getduree() {
        return this.duree;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setduree(int duree) {
        this.duree = duree;
    }

    public String getRes() {
        return this.res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    @Override
    public String toString() {
        String reponse = "(FILM) >>> (NUMÉRO = " + this.num +
        ") (TITRE = " + this.titre +
        ") (RÉALISATEUR = " + this.res +
        ") (DURÉE = " + this.duree + ")";
        return reponse;
    }
}

