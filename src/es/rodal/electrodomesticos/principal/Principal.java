package es.rodal.electrodomesticos.principal;

import es.rodal.electrodomesticos.clases.Electrodomestico;

public class Principal {
	public static void main(String[] args) {
		Electrodomestico e = new Electrodomestico(10, 220, "aZul", 'a');
		Electrodomestico e2 = new Electrodomestico(0, 0, "rojoa", 'Z');
		
		System.out.println(e);
		System.out.println(e2);
		System.out.println(e.precioFinal());
	}
}
