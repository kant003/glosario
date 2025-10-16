import java.util.Scanner;

public class Abigail_Banos_2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Este programa calcula la velocidad promedio de tu trayecto.");
        System.out.println("Dime distancia de tu trayecto en km: ");
        double distancia = sc.nextDouble();
        System.out.println("Dime el tiempo que tardaste en completar el recorrido en horas: ");
        double tiempo = sc.nextDouble();
        sc.close();
        System.out.println("Tu velocidad media fue de "+(distancia/tiempo)+" km/h.");
    }
}