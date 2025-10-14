import java.util.Scanner;

public class Abigail_Banos_2
{
    public static void main(String[] args) {
       System.out.println("Dime tu edad");
       Scanner sc = new Scanner(System.in);
       int edad = sc.nextInt();
       System.out.println("Tu edad dentro de 10 años sera : "+(edad+10));
    }
}