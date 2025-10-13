
import java.util.Scanner;

public class Propuesto7 {

// Crea una clase con metodo millasAMetros() que toma como parametro de entrada un valoren millas marinas
// y las convierte a metros
// una avez tengas este metodo escribe otro millasAKilometros() que realice la misma conversion
//expresa el resultado en kilometros
//nota 1 milla marina equivale a 1852 metros

public static float millasAMetros(float marinas){
    //1 marina --------> 1852 metros
    //100 marinas -----> X
    // x = 100*1852/1
    return marinas*1852/1;
}
public static float millasAKilometros(float marinas){
    
    
    return millasAMetros(marinas)/1000;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("millas marinas a convertir");
    float millas = Float.parseFloat(sc.nextLine());
    System.out.println("EN METROS ES: "+ millasAMetros(millas));

    System.out.println("millas marinas a convertir en Kilometros");
    millas = Float.parseFloat(sc.nextLine());
    System.out.println("EN KILOMETROS ES: "+ millasAKilometros(millas));
    
}}