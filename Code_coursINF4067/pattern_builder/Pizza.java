package Code_coursINF4067.pattern_builder;


public class Pizza {
    private Pate pate;
    private Sauce sauce;
    private Garniture garniture;

    public Pizza(Pate pate, Sauce sauce, Garniture garniture) {
        this.pate = pate;
        this.sauce = sauce;
        this.garniture = garniture;
    }

    @Override
    public String toString() {
        return "Pizza avec " + pate + ", " + sauce + " et " + garniture;
    }
}