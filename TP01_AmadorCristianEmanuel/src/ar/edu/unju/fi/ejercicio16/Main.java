package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Names array = new Names();
		
		array.load_names();
		array.show_names();
		System.out.println("\nEl tamanio del arreglo de nombres es: " + array.names_lengh());
		//array.pos_To_Delet();
		//pos_delet( array );
		array.setDelet(3);
		if ( array.getDelet() > 0 && array.getDelet() < 6) {
			array.deleting();
			array.show_names();
		}
		
		
		/*//CODIGO FUNCIONANDO PERO TODO EN EL MAIN
		String[] names = new String[5];
		Scanner sc = new Scanner(System.in);
		int j = 0;
		byte delet = -1;X
		char r = 's';
		
		for (int i = 0; i < names.length; i ++) {
			
			System.out.print("Ingrese el [" + (i + 1) + "] nombre: ");
			names[i] = sc.next();
			
		}
		
		System.out.println("Mostrando el arreglo de nombres...");
		
		while( j < names.length ) {
			
			System.out.print("[" + (j + 1) + "]: " + names[j] + " ");
			j ++;
			
		}
		
		System.out.println("\nEl tamaño del arreglo es: " + names.length);
		
		do {
			
			System.out.print("Ingrese la posicion del nombre que desea eliminar: ");
			delet = sc.nextByte();
			
			if (delet < 1 || delet > 5) {
				
				System.out.println("Error, debe ingresar una posicion valida");
				System.out.println("¿Desea continuar? s/n: ");
				r = sc.next().charAt(0);
				
			} else {
				
				r = 'n';
				
			}
			
		} while (r == 's');
		
		if ( delet > 0 && delet < 6) {
			
			for (int i = 0; i < names.length ; i++) {
				
				if (i >= (delet - 1) && i < names.length - 1) {
					
					names[i] = names[i + 1];
					
				}
				
			}
			
			names[names.length - 1] = "";
		
			System.out.println("Mostrando el arreglo de nombres NUEVO...");
			
			j = 0;
			
			while( j < names.length ) {
				
				System.out.print("[" + (j + 1) + "]: " + names[j] + " ");
				j ++;
				
			}
		}
		
		sc.close();
		*/
	}
	
	public static void pos_delet(Names array ) {
		int delet;
		char r;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("Ingrese la posicion del nombre que desea eliminar: ");
			delet = sc.nextInt();
			
			if (delet < 1 || delet > 5) {
				
				System.out.println("Error, debe ingresar una posicion valida");
				System.out.println("¿Desea continuar? s/n: ");
				r = sc.next().charAt(0);
				
			} else {
				
				r = 'n';
				array.setDelet(delet);
			}
			
		} while (r == 's');
		
		sc.close();
	}

}
