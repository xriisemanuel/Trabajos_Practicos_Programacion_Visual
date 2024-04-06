package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String name;
	private String lastname;
	private int legajo;
	private double salary;
	
	final double min_salary = 210000;
	final double merit = 20000;
	
	public Empleado() {
		
	}

	public Empleado(String name, String lastname, int legajo, double salary) {
		
		this.name = name;
		this.lastname = lastname;
		this.legajo = legajo;
		
		if (salary >= min_salary) {
			this.salary = salary;
		} else {
			this.salary = min_salary;
		}
		
	}

	public void dar_Aumento(Empleado empleado) {
		
		empleado.salary += merit;
		
	}
	
	@Override
	public String toString() {
		
		return "\n Detalles del Empleado: " + name + " " +lastname+ "\n legajo: " + legajo + "\nSalario: " + salary + "$";
		
	}
	
	
	
}
