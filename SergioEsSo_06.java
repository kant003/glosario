package glosario;

public class Planeta extends Object{
	
	public static final long UA= 149597870;		//km
	
	private String nombre = null;
	private int cantidadSatelites=0;
	private double masa = 0D;			//kg
	private double volumen = 0D;		//km3
	private int diametro = 0;			//km
	private int distanciaMediaSol =0;	//exp6 km
	private double traslacion =0D;		//años
	private double rotacion =0D;		//dias
	
	enum TipoPlaneta{
		GASEOSO, TERRESTRE, ENANO
	}
	TipoPlaneta tPlan;	
	
	private boolean observable = false;
	    
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro,
			int distanciaMediaSol, TipoPlaneta tPlan, boolean observable, double traslacion, double rotacion) {
		//super();
		this.nombre = nombre;
		this.cantidadSatelites = cantidadSatelites;
		this.masa = masa;
		this.volumen = volumen;
		this.diametro = diametro;
		this.distanciaMediaSol = distanciaMediaSol;
		this.tPlan = tPlan;
		this.observable = observable;
		this.traslacion = traslacion;
		this.rotacion = rotacion;
	}
    
    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadSatelites() {
		return cantidadSatelites;
	}

	public void setCantidadSatelites(int cantidadSatelites) {
		this.cantidadSatelites = cantidadSatelites;
	}

	public double getMasa() {
		return masa;
	}

	public void setMasa(double masa) {
		this.masa = masa;
	}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public int getDistanciaMediaSol() {
		return distanciaMediaSol;
	}

	public void setDistanciaMediaSol(int distanciaMediaSol) {
		this.distanciaMediaSol = distanciaMediaSol;
	}

	public TipoPlaneta gettPlan() {
		return tPlan;
	}

	public void settPlan(TipoPlaneta tPlan) {
		this.tPlan = tPlan;
	}

	public boolean isObservable() {
		return observable;
	}

	public void setObservable(boolean observable) {
		this.observable = observable;
	}
	
	public double getTraslacion() {
		return traslacion;
	}
	
	public void setTraslacion(double traslacion) {
		this.traslacion = traslacion;
	}
	
	public double getRotacion() {
		return rotacion;
	}
	
	public void setRotacion(double rotacion) {
		this.rotacion = rotacion;
	}
   
	@Override
	public String toString() {
		return "Planeta [nombre=" + nombre + ", cantidadSatelites=" + cantidadSatelites + ", masa=" + masa
				+ ", volumen=" + volumen + ", diametro=" + diametro + ", distanciaMediaSol=" + distanciaMediaSol
				+ ", tPlan=" + tPlan + ", observable=" + observable + ", traslacion= "+traslacion+", rotacion= "
				+"+rotacion+"+"]";
	}

	public double densidad() {
    	return masa/volumen;		//kg/km3
    }
    
    public boolean esExterior() {
    	if(distanciaMediaSol*1E6>=3.4*UA) return false;
    	else return true;
    }
		
	public enum PlanSiSol {
	    MERCURIO,
	    VENUS,
	    TIERRA,
	    MARTE,
	    JUPITER,
	    SATURNO,
	    URANO,
	    NEPTUNO
	}
}