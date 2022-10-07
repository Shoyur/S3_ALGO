public interface IBibliotheque {
    String ajouter(Ouvrage objOuvrage);
    String supprimer(int cote);
    String rechercher(int cote);
}
