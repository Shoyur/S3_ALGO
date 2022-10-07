import java.util.Date;

public abstract class Ouvrage {

    private int cote;
    private Date dateEmprunt;
    
    Ouvrage() {}

    Ouvrage(Date dateEmprunt, int cote) {
        this.dateEmprunt = dateEmprunt;
        this.cote = cote;
    }

    
    public int getCote() {
        return cote;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public void setCote(int cote) {
        this.cote = cote;
    }
    
    public String toString() {
        return "(Cote: " + this.cote + "), (Date: " + this.dateEmprunt + ")";
    }
}
