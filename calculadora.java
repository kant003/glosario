import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        // Variables
        int num1 = 1;
        int num2 = 1;
        String accion = "";
        int resultado = 0;
        
        // Operaciones
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número: ");
        num1 = scanner.nextInt();
        
        System.out.println("Introduce el segundo número: ");
        num2 = scanner.nextInt();
        
        System.out.println("¿Qué operación quieres hacer (+, -, *, /)? ");
        accion = scanner.next();
        
        // Comparaciones de cadenas con .equals()
        if (accion.equals("+")) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma es: " + resultado);
        } else if (accion.equals("-")) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta es: " + resultado);
        } else if (accion.equals("*")) {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicación es: " + resultado);
        } else if (accion.equals("/")) {
            if (num2 == 0) {
                System.out.println("No se puede dividir entre 0");
            } else {
                resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            }
        } else {
            System.out.println("Operación no válida");
        }
        
        scanner.close();
    }
}
