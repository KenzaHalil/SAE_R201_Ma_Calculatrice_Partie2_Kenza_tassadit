public static Expression fabriqueExpression(String e) {
    e = e.trim();
    
    if (e.matches("\\d+")) {
        return new Nombre(Integer.parseInt(e));
    }
    
    int openParenthesis = 0;
    for (int i = 0; i < e.length(); i++) {
        char c = e.charAt(i);
        if (c == '(') openParenthesis++;
        if (c == ')') openParenthesis--;
        
        if (openParenthesis == 0) {
            if (c == '+') {
                return new Addition(fabriqueExpression(e.substring(0, i).trim()), fabriqueExpression(e.substring(i + 1).trim()));
            } else if (c == '-') {
                return new Soustraction(fabriqueExpression(e.substring(0, i).trim()), fabriqueExpression(e.substring(i + 1).trim()));
            } else if (c == '*') {
                return new Multiplication(fabriqueExpression(e.substring(0, i).trim()), fabriqueExpression(e.substring(i + 1).trim()));
            } else if (c == '/') {
                return new Division(fabriqueExpression(e.substring(0, i).trim()), fabriqueExpression(e.substring(i + 1).trim()));
            }
        }
    }
    
    return null; // or throw an exception if the expression is invalid
}