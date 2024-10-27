import java.util.Scanner;

public class Seguimiento {

    public static void main(String[] args) {

        System.out.println("Ingrese el término de la serie de Fibonacci a consultar");
        Scanner lector = new Scanner(System.in);
        int n = lector.nextInt();

        // n debe ser mayor a 0
        if (n <= 0) {
            System.out.println("Inválido, ingrese número mayor a 0");
            return;
        }
        int[] serie_fibonacci = new int[n];
        // Inicializa el array para la serie de Fibonacci
        
        serie_fibonacci[0] = 1;
        if (n > 1) {
            serie_fibonacci[1] = 1;
        }

        // Genera el resto de valores de la serie
        for (int i = 2; i < n; i++) {
            System.out.println("Iteración  " + (i-1));
            serie_fibonacci[i] = serie_fibonacci[i - 1] + serie_fibonacci[i - 2];
            System.out.println(getFormatArray(serie_fibonacci));
        }
        }

    // Método para imprimir la serie de Fibonacci hasta el n-ésimo número
    public static void imprimirSerie(int[] serie, int n) {
        System.out.println("Serie de Fibonacci hasta el término " + n + ":");
        System.out.println(getFormatArray(serie));
    }

    // Método para sumar los elementos de la serie de Fibonacci
    public static int sumarSerie(int[] serie, int n) {
        int suma = 0;
        for (int i = 0; i < n; i++) {
            suma += serie[i];
        }
        return suma;
    }

    // Método para formatear el array en una cadena de texto
    public static String getFormatArray(int[] array) {
        String output = "[";
        for (int i = 0; i < array.length; i++) {
            output += array[i];
            if (i < array.length - 1) {
                output += ", ";
            }
        }
        output += "]";
        return output;
    }
}

               