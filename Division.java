public class Division extends Operation {
    public Division(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    public double valeur() {
    double denominateur = getOperande2().valeur();
    if (denominateur == 0) {
        throw new ArithmeticException("Division par zéro");
    }
    return getOperande1().valeur() / denominateur;
}

    public String toString() {
        return "(" + getOperande1() + " / " + getOperande2() + ")";
    }
}