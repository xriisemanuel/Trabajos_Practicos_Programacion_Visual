package ar.edu.unju.fi.ejercicio7.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio7.model.Empleado;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		String name, lastname;
		int legajo;
		double salary;
		
		System.out.println("****************************");
		System.out.println("Registrando nuevo empleado");
		System.out.print("Ingrese el nombre: ");
		name = sc.next();
		System.out.print("Ingrese el apellido: ");
		lastname = sc.next();
		
		System.out.print("Ingrese el numero de legajo: ");
		legajo = sc.nextInt();
		
		System.out.print("Ingrese el salario: "); //formato : $123.456,9
		salary = sc.nextDouble();
		System.out.println("****************************");
		
		Empleado empleado = new Empleado(name, lastname, legajo, salary);
		
		System.out.println(empleado.toString());
		
		empleado.dar_Aumento(empleado);
			
		System.out.println("Con el aumento aplicado...");
		System.out.println(empleado.toString());
		
		sc.close();
	}

}
