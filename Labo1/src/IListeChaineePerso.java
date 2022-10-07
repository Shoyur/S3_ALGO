public interface IListeChaineePerso {
    void ajouter(Ouvrage objOuvrage);
    void supprimer(int cote);
    Noeud rechercher(int cote);
}
