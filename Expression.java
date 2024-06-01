abstract class Expression {
    public abstract int valeur();
    public abstract String toString();
}

class Nombre extends Expression {
    private int valeurNombre;

    public Nombre(int valeur) {
        this.valeurNombre = valeur;
    }

    public int valeur() {
        return valeurNombre;
    }

    
    public String toString() {
        return String.valueOf(valeurNombre);
    }
}