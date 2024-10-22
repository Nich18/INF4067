package Code_coursINF4067.pattern_builder;


abstract class PizzaBuilder {
    protected Pate pate;
    protected Sauce sauce;
    protected Garniture garniture;

    public abstract void construirePate();
    public abstract void construireSauce();
    public abstract void construireGarniture();
    
    public Pizza construirePizza() {
        return new Pizza(pate, sauce, garniture);
    }
}