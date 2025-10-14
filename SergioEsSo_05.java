package glosario;

import glosario.Planeta.TipoPlaneta;

public class testPlaneta {
	
	public static void main(String[] args) {
		
		Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150, TipoPlaneta.TERRESTRE, true, 1, 365.25);
		
		System.out.println(tierra);
		System.out.println("Densidad de Tierra: "+tierra.densidad()+" kg/km3");
		System.out.println("¿Tierra es planeta exterior?: "+tierra.esExterior());
		
	}
}