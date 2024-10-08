package Code_coursINF4067.PatternSingleton;

// Client.java
public class Client {
    public static void main(String[] args) {
        // Obtention de l'instance unique avec des valeurs initiales
        OperationMathematique opMath1 = OperationMathematique.getInstance(5, 10);
        System.out.println("Instance 1 : " + opMath1);

        // Utilisation des méthodes somme et moyenne
        double somme2 = opMath1.somme(opMath1.getValeur1(), opMath1.getValeur2());
        double somme3 = opMath1.somme(5, 10, 15);
        System.out.println("Somme de 5 et 10 : " + somme2);
        System.out.println("Somme de 5, 10 et 15 : " + somme3);

        double moyenne2 = opMath1.moyenne(opMath1.getValeur1(), opMath1.getValeur2());
        double moyenne3 = opMath1.moyenne(5, 10, 15);
        System.out.println("Moyenne de 5 et 10 : " + moyenne2);
        System.out.println("Moyenne de 5, 10 et 15 : " + moyenne3);

        // Obtention de l'instance à nouveau
        OperationMathematique opMath2 = OperationMathematique.getInstance();
        System.out.println("Instance 2 : " + opMath2);

        
        
    }
}