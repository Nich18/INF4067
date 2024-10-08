package Code_coursINF4067.PatternFactory;

public class FabriqueProduitA implements Fabrique  {
    @Override
    public Produit creerProduit() {
        return new ProduitA();
    }

}
