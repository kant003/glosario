import java.util.Scanner;

public class HectorMorenoPiedraPapelTijera {

    public static Scanner sc = new Scanner(System.in);
    public static int respuesta, respuestaIA, respuestaBoolean;
    public static boolean decision = true;

    public static void programa() {
        while (decision) {
            comentarioInicial();
            estructura();
            System.out.println("quieres seguir?(1/S)(2/N)");
            respuestaBoolean=sc.nextInt();
            if (respuestaBoolean==2){
                decision = false;
            }
        }
    }

    public static void comentarioInicial() {
        System.out.println("1...2...3... PIEDRA PAPEL TIJERA");
    }

    public static void estructura() {
        System.out.println("(1)PIEDRA\n(2)PAPEL\n(3)TIJERA\n");
        respuesta = sc.nextInt();
        sc.nextLine();
        System.out.println("Respuesta de la maquina");
        respuestaIA = (int) ((Math.random()* 3)+1);
        System.out.println("La IA ha lanzado :\n" + respuestaIA);
        if (respuesta == 3 && respuestaIA == 1) {
            System.out.println("ha ganado IA");
        }
        if (respuesta == 3 && respuestaIA == 1) {
            System.out.println("ha ganado IA");
        }
        if (respuesta == 2 && respuestaIA == 1) {
            System.out.println("has ganado Tu");
        }
        if (respuesta == 1 && respuestaIA == 1) {
            System.out.println("empate");
        }
        if (respuesta == 1 && respuestaIA == 2) {
            System.out.println("ha ganado IA");
        }
        if (respuesta == 2 && respuestaIA == 2) {
            System.out.println("empate");
        }
        if (respuesta == 3 && respuestaIA == 2) {
            System.out.println("has ganado tu");
        }
        if (respuesta == 1 && respuestaIA == 3) {
            System.out.println("has ganado tu");
        }
        if (respuesta == 2 && respuestaIA == 3) {
            System.out.println("ha ganado IA");
        }
        if (respuesta == 3 && respuestaIA == 3) {
            System.out.println("empate");
        }
    }
    public static void main(String[] args) {
        programa();
    }
}
