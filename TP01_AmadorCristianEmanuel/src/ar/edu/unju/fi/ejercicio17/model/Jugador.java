package ar.edu.unju.fi.ejercicio17.model;

import java.time.LocalDate;

public class Jugador {
	private String name;
	private String lastname;
	private LocalDate birthdate;
	private String nacionality;
	private float high;
	private float weight;
	private String position;
	
	public Jugador() {
		super();
	}

	public Jugador(String name, String lastname, LocalDate birthdate, String nacionality, float high, float weight,
			String position) {
		this.name = name;
		this.lastname = lastname;
		this.birthdate = birthdate;
		this.nacionality = nacionality;
		this.high = high;
		this.weight = weight;
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	public String getNacionality() {
		return nacionality;
	}

	public void setNacionality(String nacionality) {
		this.nacionality = nacionality;
	}

	public float getHigh() {
		return high;
	}

	public void setHigh(float high) {
		this.high = high;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public int calcularEdad() {
		return LocalDate.now().getYear() - birthdate.getYear();
	}

	@Override
	public String toString() {
		return "\nDETALLE DEL JUGADOR \nNombre: " + name + "\nApellido: " + lastname + "\nFecha de Cumpleanios: " + birthdate + "\nNacionalidad: "
				+ nacionality + "\nAltura: " + high + "\nPeso: " + weight + "\nPosicion en la cancha: " + position;
	}
	
	
}
