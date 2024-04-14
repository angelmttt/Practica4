package aplicacion;
import java.util.Scanner;
import dominio.CalculadoraDistancias;

public class Principal {
        
    // Definimos las palabras entre las cuales queremos calcular la distancia de edición
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra: ");
        String palabra1 = sc.nextLine();
        
        System.out.println("Ingrese otra palabra: ");
        String palabra2 = sc.nextLine();
        
        // Caclulamos la distancia y la guardamos en una variable distancia y mostramos el resultado
        
        int distancia = CalculadoraDistancias.calcularDistancia(palabra1, palabra2);
        System.out.println("La distancia de edición entre '" + palabra1 + "' y '" + palabra2 + "' es: " + distancia);
    }
}