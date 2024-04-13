package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tam;
		String[] array;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Ingrese el tamaño del array entre [5 y 10]: ");
			tam = sc.nextInt();
			
			if (tam < 5 || tam > 10) {
				System.out.println("Valor ingresado es Invalido, intente nuevamente...");
			}
			
		} while (tam < 5 || tam > 10);
		
		array = new String[tam];
		
		for (int i = 0; i < array.length; i ++) {
			System.out.print("Ingrese un nombre para la pos " + (i + 1) + ": ");
			array[i] = sc.next();
		}
		
		System.out.println("Los nombres almacenados en el arreglo son: ");
		
		for (int i = array.length - 1; i >= 0; i --) {
			System.out.println("[" + (i + 1) + "]: " + array[i]);
		}
		
		sc.close();
	}

}
