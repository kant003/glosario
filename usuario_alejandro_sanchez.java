import java.util.Scanner;

public class usuario {

public static void main(String[] args) {
    String nombre;
String contraseña;
Scanner teclado = new Scanner(System.in);
System.out.println("Ingrese su nombre de usuario");
nombre = teclado.nextLine();
System.out.println("Ingrese su contraseña");
contraseña = teclado.nextLine();
if (nombre.equals("admin") && contraseña.equals("1234")) {
    System.out.println("Acceso concedido");
} else {
    System.out.println("Acceso denegado");
}
}
}
