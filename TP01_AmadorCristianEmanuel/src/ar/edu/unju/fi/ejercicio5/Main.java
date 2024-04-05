package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero entre [1 - 9]: ");
		
		if (sc.hasNextInt()) {
			
			num = sc.nextInt();
			
			if (num > 0 && num < 10) {
				
				for (int i = 0; i < 11; i ++) {
					
					System.out.println(num + " x " + i + " = " + num * i);
					
				}
				
			} else {
				
				System.out.println("El numero ingresado se encuentra fuera del rango");
				
			}
			
		} else {
			
			System.out.println("Debe ingresar un numero");
			
		}
		
		sc.close();

	}

}
