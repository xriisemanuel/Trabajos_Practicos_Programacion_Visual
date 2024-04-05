package ar.edu.unju.fi.ejercicio7.model;

public class Empleado {
	
	private String name;
	private int legajo;
	private double salary;
	
	final double min_salary = 210000.00;
	final double merit = 20000.00;
	
	public Empleado() {
		
	}

	public Empleado(String name, int legajo, double salary) {
		super();
		this.name = name;
		this.legajo = legajo;
		
		if (salary >= min_salary) {
			this.salary = salary;
		} else {
			this.salary = min_salary;
		}
		
	}

	@Override
	public String toString() {
		return "Empleado [name=" + name + ", legajo=" + legajo + ", salary=" + salary + "]";
	}
	
	
}
