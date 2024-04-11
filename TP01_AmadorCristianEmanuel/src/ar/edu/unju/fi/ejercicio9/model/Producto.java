package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	private String name;
	private String code;
	private double price;
	private double offprice;
	private double off;
	
	public Producto() {
		
	}
	
	public Producto(String name, String code, double price, double off) {
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

	public double getOff() {
		return off;
	}

	public void setOff(double off) {
		this.off = off;
	}
	
	
	public double getOffprice() {
		return offprice;
	}

	public void setOffprice(double offprice) {
		this.offprice = offprice;
	}

	public double calcularDescuento(double off) {
		
		if (off > 0) {
			
			return price - (off * price)/100;
			
		} else {
			
			return 0d;
		}
	}

	@Override
	public String toString() {
		return "\nDetalles del Producto: " + name + "\nCodigo: " + code + "\nPrecio: " + price + "$\nDescuento Aplicado: " + off + "%" + "\nPrecio con descuento: $" + offprice;
	}
	
	
	
}
