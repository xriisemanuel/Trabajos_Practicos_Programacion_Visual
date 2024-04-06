package ar.edu.unju.fi.ejercicio8.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio8.model.CalculadoraEspecial;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		CalculadoraEspecial calculo = new CalculadoraEspecial();
		
		System.out.println("*Mi Calculadora espercial*");
		System.out.print("Ingrese un numero de iteraciónes deseada: ");
		calculo.setN(sc.nextInt());
		
		System.out.println("El resultado de la Sumatoria es: " + calculo.calcularSumatoria(calculo.getN()));
		System.out.println("El resultado de la Productoria es: " + calculo.calcularProductoria(calculo.getN()));
		
		sc.close();
	}

}
