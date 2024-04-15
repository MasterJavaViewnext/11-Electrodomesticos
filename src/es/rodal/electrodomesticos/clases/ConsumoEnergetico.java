package es.rodal.electrodomesticos.clases;

public enum ConsumoEnergetico {
	A(100),B(80),C(60),D(50),E(30),F(10);
	
	private double precio;
	
	private ConsumoEnergetico(double precio) {
		this.precio = precio;
	}
}
