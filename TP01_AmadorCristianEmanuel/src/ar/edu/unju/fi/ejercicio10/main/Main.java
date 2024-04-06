package ar.edu.unju.fi.ejercicio10.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio10.model.Pizza;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 0;
		char answer = 'n';
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i < 4; i ++) {
			
			Pizza pizza = new Pizza();
			
			System.out.println("---------------------------");
			System.out.println("\n* Detalles del pedido *");
			
			do {
				
				System.out.println("Ingrese 1 - Pizza pequeña de diametro: 20um");
				System.out.println("Ingrese 2 - Pizza Mediana de diametro: 30um");
				System.out.println("Ingrese 3 - Pizza Grande de diametro: 40um");
				System.out.print("Ingrese una opcion: ");
				opcion = sc.nextInt();
				
				if (opcion < 1 || opcion > 3) {
					System.out.println("¡Error de opcion elegida, intente nuevamente!");
				}
			} while (opcion < 1 || opcion > 3);
			
		    switch (opcion) {
	        case 1:
	        		pizza.setDiameter(20);
	            break;
	        case 2:
	        		pizza.setDiameter(30);
	            break;
	        case 3:
	        		pizza.setDiameter(40);
	            break;
		    }
		    
			System.out.println("¿lleva ingredientes especiales? s/n");
			answer = sc.next().charAt(0);
			
			if (answer == 's') {
				pizza.setSpecial_ingredients(true);
				pizza.setPrice(pizza.calcularPrecio(opcion, true));
			} else {
				pizza.setSpecial_ingredients(false);
				pizza.setPrice(pizza.calcularPrecio(opcion, false));
			}
			
			pizza.setArea(pizza.calcularArea(pizza.getDiameter()));
			
			System.out.println(pizza.toString(i));
		}
		
		sc.close();
		
	}

}
