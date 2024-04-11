package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		String code;
		double price;
		double off = -1d; 
		int counter = 3;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("\"Cargando datos del nuevo producto\"");
			System.out.print("Ingrese el nombre: ");
			name = sc.next();
			
			System.out.println("Ingrese el codigo: ");
			code = sc.next();
			
			System.out.println("Ingrese el precio: ");
			price = sc.nextDouble();
			
			do {
				
				System.out.println("Ingrese el descuento entre [0% - 50%]: ");
				off = sc.nextInt();
				
				if (off < 0 || off > 50) {
					
					System.out.println("¡Error en el descuento ingresado!, intente nuevamente...");
				}
				
			} while (off < 0 || off > 50);
			
			Producto product = new Producto();
			
			product.setName(name);
			product.setCode(code);
			product.setPrice(price);
			product.setOff(off);
			product.setOffprice(product.calcularDescuento(off));
			System.out.println();
			System.out.println(product.toString());
			
			counter --;
			
		} while (counter > 0);
		
		sc.close();
	}

}
