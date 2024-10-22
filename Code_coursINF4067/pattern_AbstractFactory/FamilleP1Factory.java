package Code_coursINF4067.pattern_AbstractFactory;

// Famille1Factory.java
public class FamilleP1Factory extends ProduitFactory {
    @Override
    public ProduitA creerProduitA() {
        return new ProduitA1();
    }

    @Override
    public ProduitB creerProduitB() {
        return new ProduitB1();
    }
}
