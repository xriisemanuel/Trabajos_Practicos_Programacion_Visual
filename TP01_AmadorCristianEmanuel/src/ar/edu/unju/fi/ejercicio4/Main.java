package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int num, fact = 1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entre [0 - 10]: ");
		
		if (sc.hasNextInt()) {
			
			num = sc.nextInt();
			
			if (num > 1 && num < 11) {
				
				while (num > 1) {
					
					fact *= num;
					
					num --;
					
				}
				
				System.out.println("El factorial de: " + num + " es: " + fact);
				
			} else {
				
				if (num == 0 || num == 1) {
					
					System.out.println("El factorial de: " + num + " es: 1");
					
				} else {
					
					System.out.println( "Ingresaste un numero fuera del rango");
					
				}
				
			}
			
		} else {
			
			System.out.println("Debe ingresar un numero");
			
		}
		
		sc.close();
	
	}

}
