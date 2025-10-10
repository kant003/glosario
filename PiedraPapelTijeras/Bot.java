package PiedraPapelTijeras;

import java.net.StandardSocketOptions;
import java.util.Random;

public class Bot {
    //atributos
    private int eleccion;
    private String nombre="Hecbot";
    private int max=3;
    private int min=1;
    private int contadorB;

    //constructor
    public void Bot(){
    this.eleccion=eleccion;
    this.nombre=nombre;
    this.contadorB=contadorB;
    }

    //getters y setters
    public int getEleccionB() {
        return eleccion;
    }
    public void setEleccionB(int eleccionB) {
        this.eleccion = eleccion;
    }

    public int getContadorB() {
        return contadorB;
    }

    //metodos
    public void eleccionBot(){
        Random random=new Random();
        eleccion = random.nextInt((max-min)+1)+min;
    }

    public void presentacionBot(){
        System.out.println("Hola, soy "+nombre);
        System.out.println("Vamos a jugar a piedra, papel y tijeras al mejor de 5, el que gane tres veces ganara la partida");
    }

    public void sumaPuntosB(){
        contadorB++;
    }
}

