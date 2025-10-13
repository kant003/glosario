import java.util.Scanner;

public class pablo_reboredo_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        int suma = num1 + num2;
        System.out.println("La suma de los dos números es: " + suma);

        scanner.close();
    }
}
