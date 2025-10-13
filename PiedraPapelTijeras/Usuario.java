package PiedraPapelTijeras;

import java.util.Scanner;


public class Usuario {

    //atributos;
    private String nombreU;
    private int eleccion;
    private int contadorU;


    //constructor
    public void Usuario(){
        this.nombreU= nombreU;
        this.eleccion=eleccion;
        this.contadorU=contadorU;
    }

    //getters y setters

    public String getNombre() {
        return nombreU;
    }

    public void setNombreU(String nombreU) {
        this.nombreU=nombreU;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion=eleccion;
    }

    public int getContadorU() {
        return contadorU;
    }

    //metodos
    public void pedirNombre(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce tu nombre por favor");
        nombreU=sc.nextLine();
    }

    public void pedirEleccion(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Elige: 1 (para piedra), 2 (para papel), 3 (para tijeras)");
            eleccion = sc.nextInt();
    }

    public void sumaPuntosU(){
        contadorU++;
    }

}
