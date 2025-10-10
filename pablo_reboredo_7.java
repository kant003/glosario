import java.util.Scanner;

public class pablo_reboredo_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numero = teclado.nextInt();

        if (numero % 2 == 0) {
            System.out.println("ES PAR");
        } else {
            System.out.println("ES IMPAR");
        }
        teclado.close();
    }
}