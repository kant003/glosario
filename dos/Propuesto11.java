package dos;

import java.util.Scanner;

public class Propuesto11 {
//11. (Ejercicio de dificultad alta) El restaurante mejicano de Lukas
// cuya especialidad son las papas con chocos nos pide diseñar un método 
//con el que se pueda saber cuántos clientes pueden atender Lukas con la materia
// prima que tienen en el almacén.
// El método recibe la cantidad de papas y chocos en kilos y devuelve el número
 //de clientes que puede atender el restaurante teniendo en cuenta
 // que por cada tres personas, Lukas utiliza un kilo de papas y medio de chocos.

  //Metodo para saber el numero de clientes en funcion de los kilos de P y C que tengo

public static float maxClientesPorPapas(float papas) {
   return papas / (1f/3f);
}

public static float maxClientesPorChocos(float chocos) {
   return chocos / (0.5f/3f);
}
 public static float maxClientes(float papas, float chocos) {
        float clientesPorPapas = maxClientesPorPapas(papas);
        float clientesPorChocos = maxClientesPorChocos(chocos);
        return Math.min(clientesPorPapas, clientesPorChocos);
    }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   System.out.println("Cantidad de papas en KGs: ");
   float papas = Float.parseFloat(sc.nextLine());
    System.out.println("Cantidad de Chocos en Kgs: ");
float chocos = Float.parseFloat(sc.nextLine());
float maxClientes = maxClientes(papas, chocos);

        System.out.println("El máximo de clientes que se pueden atender es: " + maxClientes);




  }






















}
