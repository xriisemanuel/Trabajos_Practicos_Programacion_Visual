package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int [] numbers = new int[8];
		
		for (int i = 0; i < 8; i ++) {
			
			System.out.print("Ingrese un valor para la posicion: [" + (i + 1) +"]: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.print("Values of Array are: ");
		for (int x: numbers) {
			
			System.out.print(x + " ");
		}
		
		sc.close();
	}

}
