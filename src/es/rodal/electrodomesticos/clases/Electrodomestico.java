package es.rodal.electrodomesticos.clases;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

public class Electrodomestico {

	protected static final double PRECIO_DEFAULT = 100;
	protected static final double PESO_DEFAULT = 5;
	protected static final Color COLOR_DEFAULT = Color.BLANCO;
	protected static final ConsumoEnergetico CONSUMO_DEFAULT = ConsumoEnergetico.F;

	protected double precio;
	protected double peso;
	protected Color color;
	protected ConsumoEnergetico consumo;

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

	public Electrodomestico(double precio, double peso, String color, char consumo) {
		this.precio = precio;
		this.peso = peso;
		this.color = getEnumValueOrDefault(color, Color.class, COLOR_DEFAULT);
		//this.consumo = comprobarConsumoEnergetico(consumo);
		this.consumo = getEnumValueOrDefault(String.valueOf(consumo), ConsumoEnergetico.class, CONSUMO_DEFAULT);

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
	
	/**
	 * Metodo generico que devuelve el valor recibido del enum si lo encuentra, si no el valor por defecto
	 * @param <T>
	 * @param value
	 * @param enumClass
	 * @param defaultValue
	 * @return enumValue
	 */
	public static <T extends Enum<T>> T getEnumValueOrDefault(String value, Class<T> enumClass, T defaultValue) {
        try {
        	//Devuelve el valor del enum si lo encuentra
            return Enum.valueOf(enumClass, value.toUpperCase());
        } catch (IllegalArgumentException e) {
            //Si el valor no existe devuelve el valor predeterminado
            return defaultValue;
        }
    }
	
	public double precioFinal() {
		double precioPeso;

		if(this.peso<20) {
			precioPeso = 10; 
		} else if (this.peso < 50) {
			precioPeso = 50;
		} else if (this.peso < 80) {
			precioPeso = 80;
		} else {
			precioPeso = 100;
		}
		
		return precioPeso + this.precio + this.consumo.getPrecio();
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio=" + precio + ", peso=" + peso + ", color=" + color + ", consumo=" + consumo
				+ "]";
	}

}
