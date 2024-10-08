package Code_coursINF4067.PatternFactory;

public class FabriqueProduitC implements Fabrique  {
    @Override
    public Produit creerProduit() {
        return new ProduitC();
    }

}
