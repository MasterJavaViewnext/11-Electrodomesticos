package es.rodal.electrodomesticos.clases;

public class Lavadora extends Electrodomestico {
	
	public static final int CARGA_DEFAULT = 5;
	
	private int carga;
	
	public Lavadora() {
		super();
		this.carga = CARGA_DEFAULT; 
	}
	
	public Lavadora(double precio, double peso) {
		super(precio, peso);
		this.carga = CARGA_DEFAULT; 
	}
	
	public Lavadora (double precio, double peso, String color, char consumo, int carga) {
		super(precio, peso, color, consumo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public double precioFinal() {
		double suplemento = 0;
		if (carga > 30) {
			suplemento = 50;
		}
		return super.precioFinal() + suplemento;
	}
	
	
}
