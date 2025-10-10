import java.util.Random;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {

    int eleccionU=0;
    int eleccionB=0;
    int piedra = 1;
    int papel = 2;
    int tijeras = 3;
    int min= 1;
    int max= 3;
    int seguir=0;

    Scanner sc=new Scanner(System.in);
    Random random=new Random();

    do{
        
    System.out.println("Escoge: 1(piedra, 2(papel), 3(tijeras))");
    eleccionU=sc.nextInt();
    eleccionB=min + random.nextInt(max - min + 1);
        if (eleccionU==eleccionB) {

            System.out.println("Empate otra vez");
            System.out.println("Otra vez?: Si(1), No(2)");
            seguir=sc.nextInt();
            while (seguir!=1 && seguir != 2) {
                System.out.println("Valor introducido incorrecto repite la eleccion");
                seguir=sc.nextInt();
            }

        }else if (eleccionU==1 && eleccionB==3) {

            System.out.println("Piedra le gana a tijeras has ganado");
            System.out.println("Otra vez?: Si(1), No(2)");
            seguir=sc.nextInt();
            while (seguir!=1 && seguir != 2) {
                System.out.println("Valor introducido incorrecto repite la eleccion");
                seguir=sc.nextInt();
            }

        }else if (eleccionU==1 && eleccionB==2) {

            System.out.println("Papel le gana a piedra el bot gana");
             System.out.println("Otra vez?: Si(1), No(2)");
            seguir=sc.nextInt();
            while (seguir!=1 && seguir != 2) {
                System.out.println("Valor introducido incorrecto repite la eleccion");
                seguir=sc.nextInt();
            }

        }else if (eleccionU==2 && eleccionB==1) {

            System.out.println("Papel le gana a piedra has ganado");
             System.out.println("Otra vez?: Si(1), No(2)");
            seguir=sc.nextInt();
            while (seguir!=1 && seguir != 2) {
                System.out.println("Valor introducido incorrecto repite la eleccion");
                seguir=sc.nextInt();
            }

        }else if(eleccionU==2 && eleccionB==3){

            System.out.println("Tijeras le ganan a papel el bot gana");
             System.out.println("Otra vez?: Si(1), No(2)");
            seguir=sc.nextInt();
            while (seguir!=1 && seguir != 2) {
                System.out.println("Valor introducido incorrecto repite la eleccion");
                seguir=sc.nextInt();
            }

        }else if (eleccionU==3 && eleccionB==1) {

            System.out.println("Piedra le gana a tijeras el bot gana");
             System.out.println("Otra vez?: Si(1), No(2)");
            seguir=sc.nextInt();
            while (seguir!=1 && seguir != 2) {
                System.out.println("Valor introducido incorrecto repite la eleccion");
                seguir=sc.nextInt();
            }

        }else if (eleccionU==3 && eleccionB==2) {

            System.out.println("Tijeras le ganan a papel has ganado");
             System.out.println("Otra vez?: Si(1), No(2)");
            seguir=sc.nextInt();
            while (seguir!=1 && seguir != 2) {
                System.out.println("Valor introducido incorrecto repite la eleccion");
                seguir=sc.nextInt();
            }

        }else{

            System.out.println("Eleccion incorrecta repite");
        }
    }while(seguir==1);
    
        System.out.println("Chao gracias por jugar");

    }


}
