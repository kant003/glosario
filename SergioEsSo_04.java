package glosario;

import java.util.Random;

public class RandomChar {
	
	//método estático
	public static char getLetras() {
		return (char) (Math.random()*26+'a');
	}
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int veces = rand.nextInt(10)+3;
		int contvoc = 0;
		int contcon = 0;
		
		System.out.println("Se va a generar un total de "+veces+" carácteres.");
		
		for(int i=0; i<veces; i++) {
			
			char letra = getLetras();
			if (letra =='a'||letra =='e'||letra =='i'||letra =='o'||letra =='u') {
				System.out.println(letra+" es vocal");
				contvoc++;
			}
			else {
				System.out.println(letra+" es consonante");
				contcon++;
			}
		}
		
		System.out.println("El número de vocales es: "+contvoc);
		System.out.println("El número de consonantes es: "+contcon);
	}
}