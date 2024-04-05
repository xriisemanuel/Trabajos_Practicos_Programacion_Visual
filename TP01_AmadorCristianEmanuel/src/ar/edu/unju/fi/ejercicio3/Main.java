package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingresa un numero: ");
		
		int num = sc.nextInt();
		
		esPar(num);
		
		sc.close();

	}
	
	public static void esPar(int num) {
		
		if (num % 2 != 0) {
			
			System.out.println("Numero Impar: " + 2 * num);
			
		} else {
			
			System.out.println("Numero Par: " + 3 * num);
			
		}
		
	}
	
}
