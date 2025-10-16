public class Automovil {
    public enum TipoCombustible { GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL }
    public enum TipoAutomovil { CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV }
    public enum Color { BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA }

    private String marca;
    private int modelo;
    private double motor;
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private double velocidadMaxima;
    private Color color;
    private double velocidadActual;

    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil,
                     int numeroPuertas, int cantidadAsientos, double velocidadMaxima, Color color, double velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }
    public int getModelo() { return modelo; }
    public void setModelo(int modelo) { this.modelo = modelo; }
    public double getMotor() { return motor; }
    public void setMotor(double motor) { this.motor = motor; }
    public TipoCombustible getTipoCombustible() { return tipoCombustible; }
    public void setTipoCombustible(TipoCombustible tipoCombustible) { this.tipoCombustible = tipoCombustible; }
    public TipoAutomovil getTipoAutomovil() { return tipoAutomovil; }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) { this.tipoAutomovil = tipoAutomovil; }
    public int getNumeroPuertas() { return numeroPuertas; }
    public void setNumeroPuertas(int numeroPuertas) { this.numeroPuertas = numeroPuertas; }
    public int getCantidadAsientos() { return cantidadAsientos; }
    public void setCantidadAsientos(int cantidadAsientos) { this.cantidadAsientos = cantidadAsientos; }
    public double getVelocidadMaxima() { return velocidadMaxima; }
    public void setVelocidadMaxima(double velocidadMaxima) { this.velocidadMaxima = velocidadMaxima; }
    public Color getColor() { return color; }
    public void setColor(Color color) { this.color = color; }
    public double getVelocidadActual() { return velocidadActual; }
    public void setVelocidadActual(double velocidadActual) { this.velocidadActual = velocidadActual; }

    public void acelerar(double incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            System.out.println("No se puede exceder la velocidad máxima de " + velocidadMaxima + " km/h");
        } else {
            velocidadActual += incremento;
        }
    }

    public void desacelerar(double decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede reducir a una velocidad negativa");
        } else {
            velocidadActual -= decremento;
        }
    }

    public void frenar() {
        velocidadActual = 0;
    }

    public double calcularTiempoLlegada(double distancia) {
        if (velocidadActual <= 0) {
            System.out.println("La velocidad actual es cero, no se puede calcular el tiempo");
            return -1;
        }
        return distancia / velocidadActual;
    }

    public void mostrarInformacion() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Motor: " + motor + " L");
        System.out.println("Tipo de Combustible: " + tipoCombustible);
        System.out.println("Tipo de Automóvil: " + tipoAutomovil);
        System.out.println("Puertas: " + numeroPuertas);
        System.out.println("Asientos: " + cantidadAsientos);
        System.out.println("Velocidad Máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad Actual: " + velocidadActual + " km/h");
    }

    public static void main(String[] args) {
        Automovil a = new Automovil("Toyota", 2023, 2.0, TipoCombustible.GASOLINA, TipoAutomovil.COMPACTO,
                4, 5, 220, Color.ROJO, 100);
        System.out.println("Velocidad actual: " + a.getVelocidadActual() + " km/h");
        a.acelerar(20);
        System.out.println("Velocidad actual: " + a.getVelocidadActual() + " km/h");
        a.desacelerar(50);
        System.out.println("Velocidad actual: " + a.getVelocidadActual() + " km/h");
        a.frenar();
        System.out.println("Velocidad actual: " + a.getVelocidadActual() + " km/h");
    }
}