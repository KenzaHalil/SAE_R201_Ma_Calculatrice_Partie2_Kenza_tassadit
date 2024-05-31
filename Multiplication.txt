class Multiplication extends Operation {
    public Multiplication(Expression operande1, Expression operande2) {
        super(operande1, operande2);
    }

    @Override
    public int valeur() {
        return getOperande1().valeur() * getOperande2().valeur();
    }

    @Override
    public String toString() {
        return "(" + getOperande1() + " * " + getOperande2() + ")";
    }
}=