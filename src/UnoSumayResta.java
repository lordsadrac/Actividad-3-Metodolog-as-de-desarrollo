import java.util.Scanner;

public class UnoSumayResta {

    // Método para sumar dos números
    public static double add(double a, double b) {
        return a + b;
    }

    // Método para restar dos números
    public static double subtract(double a, double b) {
        return a - b;
    }

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca los dos números
        System.out.println("Introduce el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.println("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();

        // Realizar las operaciones
        double sumResult = add(num1, num2);       // Suma
        double subtractResult = subtract(num1, num2); // Resta

        // Mostrar los resultados
        System.out.println("Resultado de la suma: " + sumResult);
        System.out.println("Resultado de la resta: " + subtractResult);

        // Cerrar el scanner
        scanner.close();
    }
}
