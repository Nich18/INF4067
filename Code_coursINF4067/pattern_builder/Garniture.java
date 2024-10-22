package Code_coursINF4067.pattern_builder;

public class Garniture {
    private String type;

    public Garniture(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}