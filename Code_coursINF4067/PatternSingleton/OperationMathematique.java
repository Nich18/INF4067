package Code_coursINF4067.PatternSingleton;

// OperationMathematique.java
public class OperationMathematique {
    
    private static OperationMathematique instance;

    private double valeur1;
    private double valeur2;
    private double valeur3;

    // Constructeur privé
    private OperationMathematique() {
        this.valeur1 = 0;
        this.valeur2 = 0;
        this.valeur3 = 0;
    }

    private OperationMathematique(double v1, double v2) {
        this.valeur1 = v1;
        this.valeur2 = v2;
        this.valeur3 = 0;
    }

    private OperationMathematique(double v1, double v2, double v3) {
        this.valeur1 = v1;
        this.valeur2 = v2;
        this.valeur3 = v3;
    }

    // Méthode pour obtenir l'instance unique
    public static OperationMathematique getInstance() {
        if (instance == null) {
            instance = new OperationMathematique();
        }
        return instance;
    }

    // Méthode pour initialiser avec deux paramètres
    public static OperationMathematique getInstance(double v1, double v2) {
        if (instance == null) {
            instance = new OperationMathematique(v1, v2);
        }
        return instance;
    }

    // Méthode pour initialiser avec trois paramètres
    public static OperationMathematique getInstance(double v1, double v2, double v3) {
        if (instance == null) {
            instance = new OperationMathematique(v1, v2, v3);
        }
        return instance;
    }

    // Méthode pour empêcher le clonage de l'instance
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cette classe ne peut pas être clonée.");
    }

    // Méthodes pour calculer la somme
    public double somme(double a, double b) {
        return a + b;
    }

    public double somme(double a, double b, double c) {
        return a + b + c;
    }

    // Méthodes pour calculer la moyenne
    public double moyenne(double a, double b) {
        return somme(a, b) / 2;
    }

    public double moyenne(double a, double b, double c) {
        return somme(a, b, c) / 3;
    }

    public double getValeur1() {
        return valeur1;
    }

    public double getValeur2() {
        return valeur2;
    }

    public double getValeur3() {
        return valeur3;
    }
}