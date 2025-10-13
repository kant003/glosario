package generadorDNI;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class recogidaDatos {
    private String nombre;
    private String apellidos;
    private int añoNacimiento;
    private String padres;
    private String nacionalidad;
    private int clave;
    private char letra;
    private int añoEmision;
    private int añoCaducidad;
    private int resto;


    public recogidaDatos(){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.añoNacimiento=añoNacimiento;
        this.padres=padres;
        this.nacionalidad=nacionalidad;
        this.clave=clave;
        this.letra=letra;
        this.añoEmision=añoEmision;
        this.añoCaducidad=añoCaducidad;
    }


    //getters y setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre: ");
        this.nombre=sc.nextLine();
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tus apellidos: ");
        this.apellidos=sc.nextLine();
    }


    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu año de nacimiento: ");
        this.añoNacimiento = sc.nextInt();
    }


        public String getPadres () {
            return padres;
        }

        public void setPadres () {
            Scanner sc = new Scanner(System.in);
            System.out.println("Dime el nombre de tus padres: ");
            this.padres = sc.nextLine();
        }

        public String getNacionalidad () {
            return nacionalidad;
        }

        public void setNacionalidad () {
            this.nacionalidad = "Española";


        }

        public int getClave () {
            return clave;
        }

        public void setClave () {
            Random rand = new Random();
            int min = 10000000;
            int max = 99999999;
            this.clave = rand.nextInt(max - min + 1) + min;
        }

        public char getLetra () {
            return letra;
        }

        public void setLetra () {
            char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
            resto = this.clave % 23;
            this.letra = letras[resto];
        }

        public int getAñoEmision () {
            return añoEmision;
        }


        public void setAñoEmision () {
            this.añoEmision = LocalDate.now().getYear();

        }

        public int getAñoCaducidad () {
            return añoCaducidad;
        }

    public void setAñoCaducidad(){
        int edad=LocalDate.now().getYear()-this.añoNacimiento;
        if(edad<5){
            this.añoCaducidad=this.añoEmision+2;
        }else if(edad>=5 && edad<30){
            this.añoCaducidad=this.añoEmision+5;
        }else if(edad>=30 && edad <70){
            this.añoCaducidad=this.añoEmision+10;
        }else if(edad>=70){
            this.añoCaducidad=this.añoEmision+70;
        }
    }

    public void impresionDNI(){
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }
        System.out.println("-----DNI-----");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellidos: "+getApellidos());
        System.out.println("Año de nacimiento: "+getAñoNacimiento());
        System.out.println("Nombre de los padres: "+getPadres());
        System.out.println("Nacionalidad: "+getNacionalidad());
        System.out.println("Clave: "+getClave()+"-"+getLetra());
        System.out.println("Año de emisión: "+getAñoEmision());
        System.out.println("Año de caducidad: "+getAñoCaducidad());
    }
}








