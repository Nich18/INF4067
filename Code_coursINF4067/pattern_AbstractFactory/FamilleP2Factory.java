package Code_coursINF4067.pattern_AbstractFactory;

public class FamilleP2Factory extends ProduitFactory{
        @Override
    public ProduitA creerProduitA() {
        return new ProduitA2();
    }

    @Override
    public ProduitB creerProduitB() {
        return new ProduitB2();
    }
}