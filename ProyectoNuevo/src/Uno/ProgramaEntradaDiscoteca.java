package Uno;

import java.util.Scanner;
import java.util.Random;

public class ProgramaEntradaDiscoteca {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random = new Random();
        int entrada=0;
        int edad=0;
        int decision= 0;
        int edadReal=0;
        int min=16;
        int max= 25;

        do{
            System.out.println("¿Tienes entrada?: 1(si) 2(no)");
            entrada=sc.nextInt();

            if(entrada==1){
                System.out.println("Dime tu edad");
                edad=sc.nextInt();
                if(edad>=18){
                    System.out.println("Dame tu dni o documento para comprobarlo por favor");
                    edadReal=  min+ random.nextInt(max-min +1 );
                    if(edadReal<18){
                        System.out.println("No tienes 18 años largo de aqui");
                        break;
                    }else{
                        System.out.println("Tienes: "+edadReal+" años2");
                        System.out.println("Adelante pasa amig@");
                        break;
                    }

                }else{
                    System.out.println("Tienes: "+edadReal+" años");
                    System.out.println("¿Que haces aqui si no tienes 18? LARGO");
                    break;
                    }
                


            }else if (entrada==2) {
                System.out.println("Dime tu edad");
                edad=sc.nextInt();
                if(edad>=18){
                    System.out.println("Dame tu dni o documento para comprobarlo por favor");
                    edadReal=  min+ random.nextInt(max-min +1 );
                    if(edadReal<18){
                        System.out.println("Tienes: "+edadReal+" años");
                        System.out.println("No tienes 18 años largo de aqui");
                        break;
                    }else{
                        System.out.println("Tienes: "+edadReal+" años");
                        System.out.println("Son 18 euros toma y pasa");
                        break;
                    }

                }else{
                    System.out.println("¿Que haces aqui si no tienes 18? LARGO");
                    break;
                    }
            }else{
                System.out.println("Mira que era una decision sencilla tu aqui no pasas vas demasiado borracho chao.");
                break;
            }



        }while(decision==1 || decision==2);

        
    }


}
