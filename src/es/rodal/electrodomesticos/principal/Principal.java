package es.rodal.electrodomesticos.principal;

import java.util.ArrayList;
import java.util.List;

import es.rodal.electrodomesticos.clases.Electrodomestico;
import es.rodal.electrodomesticos.clases.Lavadora;
import es.rodal.electrodomesticos.clases.Television;

public class Principal {
	public static void main(String[] args) {

		double sumaElectrodomesticos = 0;
		double sumaLavadoras = 0;
		double sumaTelevisiones = 0;
		List<Electrodomestico> tienda = new ArrayList<>();

		tienda.add(new Electrodomestico(200, 60, "negro", 'D'));
		tienda.add(new Lavadora(300, 70, "aZul", 'a', 40));
		tienda.add(new Television(500, 20, "aZul", 'a', 40, false));
		tienda.add(new Electrodomestico(200, 60, "negro", 'D'));
		tienda.add(new Lavadora(220, 72, "aZul", 'a', 40));
		tienda.add(new Television(1100, 18, "aZul", 'a', 75, true));
		tienda.add(new Electrodomestico(200, 60, "negro", 'D'));
		tienda.add(new Lavadora(310, 66, "aZuasd", 'Ñ', 40));
		tienda.add(new Television(100, 20, "aZul", 'a', 40, false));
		tienda.add(new Electrodomestico(200, 60, "negro", 'D'));
		
		for (Electrodomestico electrodomestico : tienda) {
			
			sumaElectrodomesticos += electrodomestico.precioFinal();
			
			if (electrodomestico instanceof Lavadora) {
				sumaLavadoras += electrodomestico.precioFinal();
			} else if (electrodomestico instanceof Television) {
				sumaTelevisiones += electrodomestico.precioFinal();
			}
		}
		
		System.out.println("Electrodomesticos = " + sumaElectrodomesticos);
		System.out.println("Lavadoras = " + sumaLavadoras);
		System.out.println("Televisiones = " + sumaTelevisiones);
		
	}
}
