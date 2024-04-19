package ar.edu.unju.fi.ejercicio18.model;

public class DestinoTuristico {
	private String code;
	private String name;
	private float price;
	private Pais pais;
	private byte days;
	
	public DestinoTuristico() {}
	
	public DestinoTuristico(String code, String name, float price, Pais pais, byte days) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.pais = pais;
		this.days = days;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public byte getDays() {
		return days;
	}

	public void setDays(byte days) {
		this.days = days;
	}

	@Override
	public String toString() {
		return "[ Detalle del DestinoTuristico ] \nCodigo: " + code + "\nNombre: " + name + "\nCosto: $" + price + "\nPais: " + pais.getName() + "\nCantidad de Dias: "
				+ days;
	}
	
	
}
