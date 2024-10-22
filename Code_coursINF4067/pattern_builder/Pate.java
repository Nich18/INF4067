package Code_coursINF4067.pattern_builder;


public class Pate {
    private String type;

    public Pate(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}