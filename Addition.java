public class Addition extends Operation {
    public Addition(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    public double valeur() {
        return operande1.valeur() + operande2.valeur();
    }

    public String toString() {
        return "(" + operande1 + " + " + operande2 + ")";
    }
}