package Clase;
import java.time.LocalDate;
import java.util.Scanner;

public class Clase {
    int numAlumnos;
    int chicos;
    int chicas;
    int ordenadores;
    int portatiles;
    int añoActual;

    //constructor

    public Clase(){
        this.numAlumnos=numAlumnos;
        this.chicos=chicos;
        this.chicas=chicas;
        this.ordenadores=ordenadores;
        this.portatiles=portatiles;
        this.añoActual=añoActual;
    }

    //getters y setters

    public int getNumAlumnos(){
        return numAlumnos;
    }

    public void setNumAlumnos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantos alumnos se han inscrito en la clase?: ");
        this.numAlumnos=sc.nextInt();

    }

    public int getChicos(){
        return chicos;
    }

    public void setChicos(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantos de tus "+this.numAlumnos+" son chicos?: ");
        this.chicos=sc.nextInt();
    }

    public int getChicas(){
        return chicas;
    }

    public void setChicas(){
        this.chicas=numAlumnos-chicos;
    }

    public int getPortatiles(){
        return portatiles;
    }

    public void setPortatiles(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Dime cuantos de ellos tienen portatiles.");
        this.portatiles=sc.nextInt();
    }

    public int getOrdenadores(){
        return ordenadores;
    }

    public void setOrdenadores(){
        this.ordenadores= numAlumnos-portatiles;
    }

    public int getAñoActual(){
        return añoActual;
    }

    public void setAñoActual(){
        LocalDate fechaActual = LocalDate.now();
        añoActual = fechaActual.getYear();
    }

    public void Descripcion(){
        System.out.println("Para este curso "+ this.añoActual+" necesitas: ");
        System.out.println(this.ordenadores+" ordenadores");
        System.out.println("Ya que tienes: "+this.numAlumnos+" alumnos los cuales "+this.chicos+" son chicos y "+this.chicas+" son mujeres");
    }

}
