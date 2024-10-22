package Code_coursINF4067.pattern_builder;


public class Client {
    public static void main(String[] args) {
        PizzaBuilder builder = new ConcretePizzaBuilder();
        PizzaDirector director = new PizzaDirector(builder);

        Pizza pizzaReine = director.construirePizzaReine();
        System.out.println(pizzaReine);

        Pizza pizzaPiquante = director.construirePizzaPiquante();
        System.out.println(pizzaPiquante);
    }
}