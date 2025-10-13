package dos;

import java.util.Scanner;

public class Propuesto11 {
	
	public static void main(String[] args) {
	
		Scanner Doom = new Scanner (System.in);
		
		System.out.println("Dame kilos de papas: ");
		double papas = Double.parseDouble(Doom.nextLine());
		
		System.out.println("Dame kilos de chocos: ");
		double chocos = Double.parseDouble(Doom.nextLine());
		
		
		System.out.println("LUKAS dará de comer al siguiente número de comensales: "+numComensales(papas,chocos));
		
		
	}

	private static int numComensales(double papas, double chocos) {
		// TODO Auto-generated method stub
		int comensales=0;
		while (papas>=1 && chocos>=0.5) {
		comensales+=3; //comensales=comensales+3;
		papas-=1;  	   //papas=papas-1
		chocos-=0.5;   //chocos=chocos-0.5;
		}
		return comensales;
	}
}
