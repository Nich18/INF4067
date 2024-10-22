package Code_coursINF4067.pattern_builder;

class ConcretePizzaBuilder extends PizzaBuilder {
    @Override
    public void construirePate() {
        pate = new Pate("Croisée");
    }

    @Override
    public void construireSauce() {
        sauce = new Sauce("Reine");
    }

    @Override
    public void construireGarniture() {
        garniture = new Garniture("Jambons et Champignons");
    }

    public void construirePizzaPiquante() {
        pate = new Pate("Feuilletée");
        sauce = new Sauce("Piquante");
        garniture = new Garniture("Pepperoni et Salami");
    }
}