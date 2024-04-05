package ar.edu.unju.fi.ejercicio6.Model;

import java.time.LocalDate;

public class Persona {
	
	private int dni;
	private String name;
	private LocalDate born;
	private String province;
	
	public Persona() {
		
	}
	
	public Persona(int dni, String name, LocalDate born, String province) {
		super();
		this.dni = dni;
		this.name = name;
		this.born = born;
		this.province = province;
	}
	
	public Persona(int dni, String name, LocalDate born) {
		super();
		this.dni = dni;
		this.name = name;
		this.born = born;
		this.province = "Jujuy";
	}	
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getBorn() {
		return born;
	}
	public void setBorn(LocalDate born) {
		this.born = born;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	
	public int Age(LocalDate date) {
		
		//int day = date.getDayOfMonth();
		//int month = date.getMonthValue();
		//se pueden hacer muchos controles en esta funcion, pero por el momento lo dejo en la base.
		
		int year = date.getYear();
		int current_year = LocalDate.now().getYear();
		
		return (current_year - year);
	}
	
	
	public boolean Older(LocalDate date) {
		
		if (Age(date) > 17) {
			
			return true;
			
		} else {
			
			return false;
			
		}
		 
	}

	@Override
	public String toString() {
		
		if (Older(born)) {
			
			return "\nMostrando los Datos de: " + name + "\ndni: " + dni + "\nFecha de Nacimiento: " + born + "\nProvincia: " + province + "\n\"Es Mayor de edad\"";
			
		} else {
			
			return "\nMostrando los Datos de: " + name + "\ndni: " + dni + "\nFecha de Nacimiento: " + born + "\nProvincia: " + province + "\n\"Es Menor de edad\"";
			
		}
		
	}	
	
}
