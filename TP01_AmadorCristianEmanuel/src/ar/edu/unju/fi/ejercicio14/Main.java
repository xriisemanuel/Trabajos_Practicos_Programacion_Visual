package ar.edu.unju.fi.ejercicio14;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tam, sum = 0;
		int[] array;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			
			System.out.println("Ingrese el tamaño del array entre [3 y 10]: ");
			tam = sc.nextInt();
			
			if (tam < 3 || tam > 10) {
				System.out.println("Valor ingresado es Invalido, intente nuevamente...");
			}
			
		} while (tam < 3 || tam > 10);
		
		array = new int[tam];
		
		for (int i = 0; i < array.length; i ++) {
			System.out.print("Ingrese un numero para la pos " + (i + 1) + ": ");
			array[i] = sc.nextInt();
		}
		
		for (int x: array) {
			sum += x;
		}
		
		System.out.println("Valores del arreglo son: ");
		
		for (int i = 0; i < array.length; i ++) {
			System.out.println("[" + (i + 1) + "]: " + array[i]);
		}
		
		System.out.println("La suma de sus elementos es: " + sum);
		
		sc.close();
	}
}
