

import java.util.Scanner;

public class porsupuesto11T{
//11. (Ejercicio de dificultad alta) El restaurante mejicano de Lukas
// cuya especialidad son las papas con chocos nos pide diseñar un método 
//con el que se pueda saber cuántos clientes pueden atender Lukas con la materia
// prima que tienen en el almacén.
// El método recibe la cantidad de papas y chocos en kilos y devuelve el número
 //de clientes que puede atender el restaurante teniendo en cuenta
 // que por cada tres personas, Lukas utiliza un kilo de papas y medio de chocos.

  //Metodo para saber el numero de clientes en funcion de los kilos de P y C que tengo

public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Dame Kilos de Papas: ");
  double papas = Double.parseDouble(scanner.nextLine());
  System.out.println("Dame kilos de Chocos: ");
  double chocos= Double.parseDouble(scanner.nextLine());

  System.out.println("Lukas Dara de comer al siguiente numero de comensales: " + numComensales(papas, chocos));

}

    private static int numComensales(double papas, double chocos) {
        int comensales=0;
        while(papas>=1 && chocos>=0.5){
            comensales+=3;
            papas-=1;   
            chocos-=0.5;
        }
        return comensales;
    }

}