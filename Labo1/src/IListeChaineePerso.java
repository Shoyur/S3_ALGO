public interface IListeChaineePerso {
    boolean ajouter(Ouvrage objOuvrage);
    boolean supprimer(int cote);
    Noeud rechercher(int cote);
}
