import java.util.Scanner;

public class pablo_reboredo_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int n1 = entrada.nextInt();

        System.out.print("Introduce el segundo número: ");
        int n2 = entrada.nextInt();

        int suma = n1 + n2;
        System.out.println("La suma de " + n1 + " y " + n2 + " es " + suma);
        entrada.close();
    }
}
