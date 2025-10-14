package dos;

public class Automovil {
	
	//atributos
	
	private String marca= null;
	private int modelo = 0;
	private double motor = 0;
	private int numpuertas = 0;
	private int numasientos = 0;
	private double vmáx = 0;
	private double Vactual = 0;
	private double distancia = 0;
	
  enum TipoCombustible{
	  
	  
	  GASOLINA, BIOETANOL, DIÉSEL, BIODIÉSEL, GASNATURAL
  }
  
  TipoCombustible tCombustible;
  
  enum TipoAutomovil{
	  CocheCiudad, COMPACTO, SUBCOMPACTO, FAMILIAR, EJECUTIVO, SUV
	  
  }
  
  TipoAutomovil tAutomovil;
  
  enum Color{
	  
	  BLANCO, NEGRO, NARANJA, ROJO, AMARILLO, VERDE, AZUL, VIOLETA
	  
  }
  
  Color col;
  
  public Automovil(String marca, int modelo, double motor, int numpuertas, 
		  int numasientos, double vmáx, double Vactual,double distancia, TipoCombustible tCombustible,TipoAutomovil tAutomovil,Color col) {
	  
	  this.marca=marca;
	  this.modelo=modelo;
	  this.motor=motor;
	  this.numpuertas=numpuertas;
	  this.numasientos=numasientos;
	  this.vmáx=vmáx;
	  this.Vactual=Vactual;
	  this.distancia=distancia;
	  this.tCombustible=tCombustible;
	  this.tAutomovil=tAutomovil;
	  this.col=col;
	  
	  
  }

  public String getMarca() {
	return marca;
  }

  public void setMarca(String marca) {
	this.marca = marca;
  }

  public int getModelo() {
	return modelo;
  }

  public void setModelo(int modelo) {
	this.modelo = modelo;
  }

  public double getMotor() {
	return motor;
  }

  public void setMotor(double motor) {
	this.motor = motor;
  }

  public int getNumpuertas() {
	return numpuertas;
  }

  public void setNumpuertas(int numpuertas) {
	this.numpuertas = numpuertas;
  }

  public int getNumasientos() {
	return numasientos;
  }

  public void setNumasientos(int numasientos) {
	this.numasientos = numasientos;
  }

  public double getVmáx() {
	return vmáx;
  }

  public void setVmáx(double vmáx) {
	this.vmáx = vmáx;
  }

  public double getVactual() {
	return Vactual;
  }

  public void setVactual(double Vactual) {
	this.Vactual = Vactual;
  }
  
  public double getdistancia() {
	  return distancia;
  }
  
  public void setdistancia(double distancia) {
	  this.distancia=distancia;
	  
	  
  }
  

  public TipoCombustible gettCombustible() {
	return tCombustible;
  }

  public void settCombustible(TipoCombustible tCombustible) {
	this.tCombustible = tCombustible;
  }

  public TipoAutomovil gettAutomovil() {
	return tAutomovil;
  }

  public void settAutomovil(TipoAutomovil tAutomovil) {
	this.tAutomovil = tAutomovil;
  }

  public Color getCol() {
	return col;
  }

  public void setCol(Color col) {
	this.col = col;
  }

  
  @Override
public String toString() {
	return "Automovil [marca=" + marca + ", modelo=" + modelo + ", motor=" + motor + ", numpuertas=" + numpuertas
			+ ", numasientos=" + numasientos + ", vmáx=" + vmáx + ", Vactual=" + Vactual + ", distancia=" + distancia
			+ ", tCombustible=" + tCombustible + ", tAutomovil=" + tAutomovil + ", col=" + col + "]";
}
  
  
  public double tiempo () {
	  
	  return distancia/Vactual;
	  
  }
  
  
  public void acelerar(double aumento) {
      if (Vactual + aumento > vmáx) {
          Vactual = vmáx;
          System.out.println("El " + marca + " ya alcanzó su velocidad máxima de " + vmáx + " km/h");
      } else {
          Vactual += aumento;
          System.out.println("El " + marca + " acelera  a " + Vactual + " km/h");
      }
  }

  public void desacelerar(double resta) {
      if (resta <= 0) {
          System.out.println("El valor de desacelerado debe ser positivo.");
      
      } else {
          Vactual -= resta;
          System.out.println("El " + marca + " desacelera  a " + Vactual + " km/h");
      }
  }
  
  public void frenar() {
	  Vactual= 0;
	  System.out.println("El choche frena a: " +Vactual+ " km/h");
	  
  }
  
  
  
  
  
  
}
