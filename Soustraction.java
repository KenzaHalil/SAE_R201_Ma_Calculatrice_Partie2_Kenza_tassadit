public class Soustraction extends Operation {
    public Soustraction(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    public double valeur() {
        return getOperande1().valeur() - getOperande2().valeur(); // Appels récursifs avec getters
    }

    public String toString() {
        return "(" + getOperande1() + " - " + getOperande2() + ")";
    }
}