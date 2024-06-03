public class TestOperation {
    public static void main(String[] args) {
        // Création des expressions pour l'opération (17-2) / (2+3)
        Expression deux = new Nombre(2);
        Expression trois = new Nombre(3);
        Expression dixSept = new Nombre(17);
        Expression s = new Soustraction(dixSept, deux);
        Expression a = new Addition(deux, trois);
        Expression d = new Division(s, a);

        // Affichage du résultat
        System.out.println(d + " = " + d.valeur()); // affiche ((17 - 2) / (2 + 3)) = 3.0
    }
public static Expression fabriqueExpression(String e) {
        e = e.trim();
        if (e.matches("\\d+(\\.\\d+)?")) {  // Si e est un nombre
            return new Nombre(Double.parseDouble(e));
        }

        // Trouver l'opération principale (opération avec la plus basse priorité)
        int openParentheses = 0;
        for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if (c == '(') openParentheses++;
            else if (c == ')') openParentheses--;
            else if ((c == '+' || c == '-' || c == '*' || c == '/') && openParentheses == 0) {
                Expression left = fabriqueExpression(e.substring(0, i));
                Expression right = fabriqueExpression(e.substring(i + 1));
                switch (c) {
                    case '+': return new Addition(left, right);
                    case '-': return new Soustraction(left, right);
                    case '*': return new Multiplication(left, right);
                    case '/': return new Division(left, right);
                }
            }
        }

        // Si l'expression est entourée de parenthèses, les enlever et appeler récursivement
        if (e.startsWith("(") && e.endsWith(")")) {
            return fabriqueExpression(e.substring(1, e.length() - 1));
        }

        throw new IllegalArgumentException("Expression invalide : " + e);
    }
}