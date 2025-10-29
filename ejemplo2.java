package tres;

import java.util.Scanner;

public class ejemplo2 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("introduce el número de mes(1-12): ");
		int mes = sc.nextInt();
		String resultado;
		
		switch(mes) {
		case 1,3,5,7,8,10,12:
		resultado= "El mes tiene 31 dias";
		break;
		
		case 4,6,9,11:
		resultado= "el mes tiene 30 dias";
		break;
		
		case 2:
		resultado= "El mes tiene 28 dias(o 29 si es bisiesto)";
		break;
		default:
			resultado="mes incorrecto";
		}
		
		
		System.out.println(resultado);
		
	sc.close();	
	}

}
