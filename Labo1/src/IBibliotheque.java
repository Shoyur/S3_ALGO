public interface IBibliotheque {
    void ajouter(Ouvrage objOuvrage);
    void supprimer(int cote);
    String rechercher(int cote);
}
