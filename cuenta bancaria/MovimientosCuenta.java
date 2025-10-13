package CuentaBancaria;

import java.util.Scanner;

public class MovimientosCuenta {
    public static void main(String[] args) {
        Usuario u1= new Usuario();
        u1.nombreUsuario();
        u1.generadorSaldo();
        int decision=0;
        int pregunta=0;
        boolean continuar=true;

        System.out.println("Bienvenido a Banco JavaEcoonomy" + u1.getNombre());

        do{
            Scanner sc=new Scanner(System.in);
            System.out.println("Que operacion deseas realizar?: 1(Revisar cuenta), 2(depositar), 3(retirar)");
            decision=sc.nextInt();
            if(decision==1){
                System.out.println("Tu saldo disponible es de: "+u1.getCuenta()+" €");
                while(pregunta!=1 && pregunta!=2){
                    System.out.println("Deseas realizar otra operacion?: 1(si), 2(no)");
                    pregunta=sc.nextInt();
                    if(pregunta==1){
                        continuar=true;
                    }else if(pregunta==2){
                        continuar=false;
                    }else{
                        System.out.println("Respuesta no valida");
                    }
                }
            }else if(decision==2){
                u1.depositar();
                System.out.println("Tu saldo disponible es de: "+u1.getCuenta()+" €");
                System.out.println("Deseas realizar otra operacion?: 1(si), 2(no)");
                pregunta=sc.nextInt();
                while(pregunta!=1 && pregunta!=2){
                    if(pregunta==1){
                        continuar=true;
                    }else if(pregunta==2){
                        continuar=false;
                    }else{
                        System.out.println("Respuesta no valida");
                    }
                }

            }else if(decision==3){
                u1.sacar();
                if(u1.getCuenta()>0){
                    System.out.println("Tu saldo disponible es de: "+u1.getCuenta()+" €");
                }else{
                    System.out.println("No tienes saldo suficiente por favor ingresa dinero");
                }
                System.out.println("Deseas realizar otra operacion?: 1(si), 2(no)");
                pregunta=sc.nextInt();
                while(pregunta!=1 && pregunta!=2){
                    if(pregunta==1){
                        continuar=true;
                    }else if(pregunta==2){
                        continuar=false;
                    }else{
                        System.out.println("Respuesta no valida");
                    }
                }
            }else{
                System.out.println("Operacion no valida");
        }
    }while(continuar==true);
        System.out.println("Su sesion ha sido cerrada gracias por operar con JavaEconomy");
    }
}
