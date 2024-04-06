package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	private String name;
	private String code;
	private double price;
	private int off;
	
	public Producto() {
		
	}
	
	public Producto(String name, String code, double price, int off) {
		super();
		this.name = name;
		this.code = code;
		this.price = price;
		this.off = off;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getOff() {
		return off;
	}

	public void setOff(int off) {
		this.off = off;
	}
	
	public double calcularDescuento( double price, int off) {
		
		if (off > 0) {
			
			return price - (double)(off * price)/100;
			
		} else {
			
			return price;
		}
		
	}

	@Override
	public String toString() {
		return "\nDetalles del Producto: " + name + "\nCodigo: " + code + "\nPrecio: " + price + "$\nDescuento Aplicado: " + off + "%";
	}
	
	
	
}
