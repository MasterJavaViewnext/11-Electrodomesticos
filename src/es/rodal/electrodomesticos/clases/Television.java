package es.rodal.electrodomesticos.clases;

public class Television extends Electrodomestico {
	
	public static final int RESOLUCION_DEFAULT = 20;
	public static final boolean TDT_DEFAULT = false;
	
	private int resolucion;
	private boolean tdt;
	
	public Television() {
		super();
		this.resolucion = RESOLUCION_DEFAULT;
		this.tdt = TDT_DEFAULT;
	}

	public Television(double precio, double peso) {
		super(precio, peso);
		this.resolucion = RESOLUCION_DEFAULT;
		this.tdt = TDT_DEFAULT;
	}
	
	public Television(double precio, double peso, String color, char consumo, int resolucion, boolean tdt) {
		super(precio, peso, color, consumo);
		this.resolucion = resolucion;
		this.tdt = tdt;
	}

	public int getResolucion() {
		return resolucion;
	}

	public boolean isTdt() {
		return tdt;
	}

	@Override
	public double precioFinal() {
		double suplemento = 0;
		
		if (this.resolucion > 40) {
			suplemento += this.precio*0.3;
		}
		if (this.tdt) {
			suplemento += 50;
		}
		
		return super.precioFinal() + suplemento;
	}
	
	
}
