public class Nombre extends Expression {
    private double valeur;

    public Nombre(double valeur) {
        this.valeur = valeur;
    }

  
    public double valeur() {
        return valeur;
    }

 
    public String toString() {
        return String.valueOf(valeur);
    }
}