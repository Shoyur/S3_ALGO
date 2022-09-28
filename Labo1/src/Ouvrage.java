public class Ouvrage {

    private String dateEmprunt;
    private int cote;
    

    Ouvrage () {}

    Ouvrage (String dateEmprunt, int cote) {
        this.dateEmprunt = dateEmprunt;
        this.cote = Bibliotheque.cote + 1;
    }

    public String toString() {
        return this.dateEmprunt + "\t" + this.cote;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public int getCote() {
        return cote;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }

}
