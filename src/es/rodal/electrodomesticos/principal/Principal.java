package es.rodal.electrodomesticos.principal;

import java.util.Arrays;

import es.rodal.electrodomesticos.clases.Color;
import es.rodal.electrodomesticos.clases.ConsumoEnergetico;
import es.rodal.electrodomesticos.clases.Electrodomestico;

public class Principal {
	public static void main(String[] args) {
		Electrodomestico e = new Electrodomestico(0, 0, Color.AZUL, 'b');
		Electrodomestico e2 = new Electrodomestico(0, 0, Color.AZUL, 'Z');
		
		System.out.println(e);
		System.out.println(e2);
	}
}
