package uno;

import java.util.Scanner;

public class Sphere {
	
	public static void main(String[] args) {
		
		double radius = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame un radio: ");
		radius = sc.nextDouble();
		double area = 4*(Math.PI)*(Math.pow(radius,2));
		double volume = (4/3d)*(Math.PI)*(Math.pow(radius,3));
		
		System.out.println("Área de la esfera es: "+area);
		System.out.println("Volumen de la esfera es: "+volume);
		
		sc.close();
	}
}