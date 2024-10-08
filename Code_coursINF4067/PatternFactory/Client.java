package Code_coursINF4067.PatternFactory;


public class Client {
    //utilisation du premier produit A
    public static void main(String[] args) {
        Fabrique fabriqueA = new FabriqueProduitA();
        Produit produitA = fabriqueA.creerProduit();
        produitA.utiliser();
//utilisation du deuxième produit fabrique B
        Fabrique fabriqueB = new FabriqueProduitB();
        Produit produitB = fabriqueB.creerProduit();
        produitB.utiliser();
//utilisation du  produit fabrique C
        Fabrique fabriqueC = new FabriqueProduitC();
        Produit produitC = fabriqueC.creerProduit();
        produitC.utiliser();
    }
}