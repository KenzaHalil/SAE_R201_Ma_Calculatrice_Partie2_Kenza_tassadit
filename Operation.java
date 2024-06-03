public abstract class Operation extends Expression {
    protected Expression operande1;
    protected Expression operande2;

    public Operation(Expression operande1, Expression operande2) {
        this.operande1 = operande1;
        this.operande2 = operande2;
    }

    public Expression getOperande1() {
        return operande1;
    }

    public Expression getOperande2() {
        return operande2;
    }

    public abstract double valeur();
}