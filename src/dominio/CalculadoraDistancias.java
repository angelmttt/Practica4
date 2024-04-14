package dominio;


public class CalculadoraDistancias {

    // Método para calcular la distancia de edición entre dos cadenas de palabras
    public static int calcularDistancia(String s1, String s2) {

        // Creamos una matriz para almacenar los valores de la distancia de edición
        
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {

                //Si cualquiera de alguna cadena esta vacia, la distancia es la longitud de la otra cadena
                if (i == 0) {
                    dp[i][j] = j;
                } else if (j == 0) {
                    dp[i][j] = i;
                }

                // Si los dos caracteres son iguales, no se realiza ninguna operación (char.At sirve para obtener el caracter en la posición i de la cadena s1)
                else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }

                // Si los caracteres son diferentes, se elige la operación que minimiza la distancia
                else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]));
                }
            }
        }

        // El valor de la distancia de edición se encuentra en la última celda de la matriz
        return dp[s1.length()][s2.length()];
    }
}