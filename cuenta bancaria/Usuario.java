package CuentaBancaria;

import java.util.Random;
import java.util.Scanner;

public class Usuario {

    //Atributos
    private String nombre;
    private int cuenta;
    private int max=10000;
    private int min= 0;
    private int movimiento;


    //Constructor

    public void Usuario(){
        this.nombre=nombre;
        this.cuenta=cuenta;
    }


    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(){
        this.nombre = nombre;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }


    //metodos

    public void nombreUsuario(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor dime tu nombre");
        nombre=sc.nextLine();
    }

    public void generadorSaldo(){
        Random random=new Random();
        cuenta = random.nextInt((max-min)+1)+min;
    }

    public void depositar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuanto desea depositar?: ");
        movimiento=sc.nextInt();
        cuenta=cuenta+movimiento;

    }

    public void sacar(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Cuanto deseas retirar?: ");
        movimiento=sc.nextInt();
        cuenta=cuenta+movimiento;
    }




}
