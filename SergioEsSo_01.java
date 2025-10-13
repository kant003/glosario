package glosario;

import java.util.Scanner;

public class Rebajas {

	public static double descubrePorcentaje(double original, double actual) {
		return (original-actual)*100/original; //=porcentaje
	}
	
	public static double precioFinal(double original, double porcentaje) {
		return original*(1-(porcentaje/100)); //=final
	}
	
	public static double precioOriginal(double actual, double porcentaje) {
		return actual/(1-(porcentaje/100)); //=original
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double original = 0d;
		double actual = 0d;
		double porcentaje = 0d;
		boolean loop = true;

		do {
			System.out.println(
"Descubrir porcentaje (1) / Descubrir final (2) / Descubrir original (3) / Matarse (4) / Ganar el Euromillón (5)");
			int seleccion = sc.nextInt();

			switch (seleccion) {

			case (1):
				// porcentaje
				System.out.println("dame original (€): ");
				original = sc.nextDouble();
				System.out.println("dame actual (€): ");
				actual = sc.nextDouble();

				System.out.println("el porcentaje de descuento es " + descubrePorcentaje(original, actual) + "%");
				break;

			case (2):
				// final
				System.out.println("dame original (€): ");
				original = sc.nextDouble();
				System.out.println("dame porcentaje (%): ");
				porcentaje = sc.nextDouble();

				System.out.println("el precio final con el descuento es " + precioFinal(original, porcentaje) + "€");
				break;

			case (3):
				// original
				System.out.println("dame final (€): ");
				actual = sc.nextDouble();
				System.out.println("dame porcentaje (%): ");
				porcentaje = sc.nextDouble();

				System.out.println("el precio final con el descuento es " + precioOriginal(actual, porcentaje) + "€");
				break;

			case (4):
				System.out.println("Venga chao (con cariño)");
				loop = false;
				break;

			case (5):
				System.out.println("Venga jódete (con cariño)");
				loop = false;
				break;
				
			default:
				System.out.println("Venga inténtalo de nuevo hostia (con cariño)");
				break;
			}
		} while (loop);
		sc.close();
	}
}