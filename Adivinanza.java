import java.util.Scanner;

public class Adivinanza {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respuestaCorrecta = "sol"; // La respuesta correcta a la adivinanza
        String respuestaUsuario;

        System.out.println("¡Bienvenido a la adivinanza!");
        System.out.println("Adivina, adivinanza: Soy redondo y brillo en el cielo, ¿quién soy?");

        System.out.print("Tu respuesta: ");
        respuestaUsuario = scanner.nextLine().toLowerCase(); // Convertir la respuesta a minúsculas

        if (respuestaUsuario.equals(respuestaCorrecta)) {
            System.out.println("¡Correcto! ¡Eres un genio!");
        } else {
            System.out.println("¡Incorrecto! La respuesta correcta es: " + respuestaCorrecta);
        }

        scanner.close();
    }

}