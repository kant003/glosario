package dos;

/// clase automovil con atributos marca, color, velocidad
public class Automovil extends Object {
    private String marca;
    private String color;
    private int velocidad;

    /// constructor por defecto
    public Automovil(String marca, String color, int i) {
        this.marca = marca;
        this.color = color;
        this.velocidad = velocidad;
    }

    //
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    // metodos acelerar y frenar
    public void acelerar(int incremento) {
        this.velocidad += incremento;
    }

    // void acelerar(int cantidad)
    public void acelera(int cantidad) {
        if (cantidad > 0) {
            velocidad = velocidad + cantidad;
            System.out.println("la nueva velocidad es: " + this.getVelocidad());
        } else if (cantidad == 0) {
            System.out.println("no aceleras: " + this.getVelocidad());

        } else {
            System.out.println("como vas a acelerar en negativo melon:");

        }
    }

    public void frena(int cantidad) {
        if (cantidad > velocidad) {
            velocidad = 0;
            System.out.println(
                    "no puedes frenar mas de tu velocidad actual por lo cual tu velocidad es: " + this.getVelocidad());
        } else if (cantidad < 0) {
            System.out.println("no puedes frenar en negativo melon: " + this.getVelocidad());

        } else {
            velocidad = velocidad - cantidad;
            System.out.println("la nueva velocidad es: " + this.getVelocidad());
        }

    }

    public void frenar(int decremento) {
        this.velocidad -= decremento;
    }

    public void claxon() {
        System.out.println("Beep Beep!");
    }

    @Override
    public String toString() {
        return "Automovil [marca=" + marca + ", color=" + color + ", velocidad=" + velocidad + "]";
    }

}
