package Code_coursINF4067.PatternFactory;

public class FabriqueProduitB implements Fabrique  {
    @Override
    public Produit creerProduit() {
        return new ProduitB();
    }

}
