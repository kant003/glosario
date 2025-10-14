
import java.util.Random;
import java.util.Scanner;

public class Adivina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        boolean seguir = true;

        while (seguir) {
            int numero = ran.nextInt(100) + 1; // número entre 1 y 100
            int intentos = 10;
            int respuesta = 0;

            System.out.println("Adivina el número (del 1 al 100)");

            while (respuesta != numero && intentos > 0) {
                System.out.print("Introduce un número: ");
                respuesta = sc.nextInt();

                if (respuesta == numero) {
                    System.out.println("Enhorabuena, has acertado");
                } else if (respuesta < numero) {
                    System.out.println("El número es MAYOR. Te quedan " + (intentos - 1) + " intentos.");
                } else {
                    System.out.println("El número es MENOR. Te quedan " + (intentos - 1) + " intentos.");
                }

                intentos--;
            }

            if (respuesta != numero) {
                System.out.println("Has perdido. El número era: " + numero);
            }

            System.out.println("Quieres jugar otra vez? (1)Sí, (2)No");
            int sigo = sc.nextInt();

            if (sigo == 1) {
                seguir = true;
            } else if (sigo == 2) {
                System.out.println("Gracias por jugar.");
                seguir = false;
            } else {
                System.out.println("Opción no válida. Saliendo del juego.");
                seguir = false;
            }

        }

        System.out.println("Fin del programa.");
    }
}
