package Code_coursINF4067.pattern_builder;

class PizzaDirector {
    private PizzaBuilder builder;

    public PizzaDirector(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza construirePizzaReine() {
        builder.construirePate();
        builder.construireSauce();
        builder.construireGarniture();
        return builder.construirePizza();
    }

    public Pizza construirePizzaPiquante() {
        ConcretePizzaBuilder concreteBuilder = (ConcretePizzaBuilder) builder;
        concreteBuilder.construirePizzaPiquante();
        return concreteBuilder.construirePizza();
    }
}