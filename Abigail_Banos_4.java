import java.util.Scanner;

public class Abigail_Banos_4
{
    public static void main(String[] args) {
       System.out.println("Este programa sirve para comprobar si el número es menor, mayor o igual que cero.");
       System.out.println("Dime el número a comprobar: ");
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
        if(num<0)
        {
            System.out.println("El número es menor que 0.");
        }
        else if(num==0)
        {
            System.out.println("El número es 0.");
        }
        else
        {
            System.out.println("El número es mayor que 0.");
        }
    }
}   