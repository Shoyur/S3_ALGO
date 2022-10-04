import java.util.Date;

public class Ouvrage {

    private Date dateEmprunt;
    private int cote;
    

    Ouvrage () {}

    Ouvrage (Date dateEmprunt, int cote) {
        this.dateEmprunt = dateEmprunt;
        this.cote = cote;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public int getCote() {
        return cote;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }
    
    public String toString() {
        return "Date : (" + this.dateEmprunt + "),\nCote : (" + this.cote + "),";
    }

}
