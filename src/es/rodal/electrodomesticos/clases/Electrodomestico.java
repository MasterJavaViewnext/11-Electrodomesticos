package es.rodal.electrodomesticos.clases;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Electrodomestico {

	protected static final double PRECIO_DEFAULT = 100;
	protected static final double PESO_DEFAULT = 5;
	protected static final Color COLOR_DEFAULT = Color.BLANCO;
	protected static final ConsumoEnergetico CONSUMO_DEFAULT = ConsumoEnergetico.F;

	private double precio;
	private double peso;
	private Color color;
	private ConsumoEnergetico consumo;

	public Electrodomestico() {
		this.precio = PRECIO_DEFAULT;
		this.peso = PESO_DEFAULT;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
	}

	public Electrodomestico(double precio, double peso) {
		this.precio = precio;
		this.peso = peso;
		this.color = COLOR_DEFAULT;
		this.consumo = CONSUMO_DEFAULT;
	}

	public Electrodomestico(double precio, double peso, Color color, char consumo) {
		this.precio = precio;
		this.peso = peso;
		this.color = color;
		this.consumo = comprobarConsumoEnergetico(consumo);

	}

	public double getPrecio() {
		return precio;
	}

	public double getPeso() {
		return peso;
	}

	public Color getColor() {
		return color;
	}

	public ConsumoEnergetico getConsumo() {
		return consumo;
	}
	
	

	/**
	 * Metodo que devuelve el ConusmoEnergetico si la letra introducida forma
	 * parte del enum, si no devuelve el valor por defecto
	 * 
	 * @param letra
	 * @return
	 */
	private ConsumoEnergetico comprobarConsumoEnergetico(char letra) {

		//Variable necesaria para modificar dentro de la lambda
		var resultado = new Object() { ConsumoEnergetico value = CONSUMO_DEFAULT; };

		Arrays.asList(ConsumoEnergetico.values()).forEach( consumo -> {
			if (consumo.toString().equalsIgnoreCase(String.valueOf(letra))) {
				resultado.value = consumo;
			}
		});

		return resultado.value;
	}
	
	
	

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo
				+ "]";
	}

}
