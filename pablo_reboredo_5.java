import java.util.Scanner;

public class pablo_reboredo_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        
        int suma = num1 + num2;
        System.out.println("La suma es: " + suma);
        
        sc.close();
    }
}