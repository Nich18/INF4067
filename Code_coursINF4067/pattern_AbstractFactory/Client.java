package Code_coursINF4067.pattern_AbstractFactory;


public class Client {
    public static void main(String[] args) {
        // Utilisation de la famille 1
        ProduitFactory factory1 = new FamilleP1Factory();
        ProduitA produitA1 = factory1.creerProduitA();
        ProduitB produitB1 = factory1.creerProduitB();

        produitA1.afficherInfo();
        produitB1.afficherInfo();

        // Utilisation de la famille 2
        ProduitFactory factory2 = new FamilleP2Factory();
        ProduitA produitA2 = factory2.creerProduitA();
        ProduitB produitB2 = factory2.creerProduitB();

        produitA2.afficherInfo();
        produitB2.afficherInfo();
    }
}