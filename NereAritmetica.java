package uno;

import java.util.Scanner;

public class AritEntPreg {

	// varios métodos

	public static int suma(int n1, int n2) {
		// suma
		int s = n1 + n2;
		return s;
	}

	public static int resta(int a, int b) {
		int res = a - b;
		return res;
	}

	public static int producto(int numero1, int numero2) {
		return numero1 * numero2;
	}

	public static int cocienteE(int n1, int n2) {
		return n1 / n2;
	}

	public static int modulo(int n1, int n2) {
		return n1 % n2;
	}

	public static int pedirNumero() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un número entero:");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String respuesta;

		do {

			int num1, num2;

			num1 = pedirNumero();
			num2 = pedirNumero();

			// suma
			int suma = suma(num1, num2);
			System.out.println("La suma de ambos números es: " + suma);

			// resta
			int resta = resta(num1, num2);
			System.out.println("La resta de ambos números es: " + resta);

			// producto
			int prod = producto(num1, num2);
			System.out.println("El producto de ambos números es: " + prod);

			// cociente
			int coc = cocienteE(num1, num2);
			System.out.println("El cociente ENTERO de ambos números es: " + coc);

			// resto
			int mod = modulo(num1, num2);
			System.out.println("El módulo o resto ENTERO de ambos números es: " + mod);

			System.out.print("Deseas continuar? (si/no): ");
			respuesta = sc.nextLine().toLowerCase();

		} while (respuesta.equals("si"));

		System.out.println("FIN DE OPERATIVAS ARITMETICAS ENTERAS");

	}
}
