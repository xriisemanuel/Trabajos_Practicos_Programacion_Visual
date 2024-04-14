package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
	
	private String name;
	private String code;
	private float price;
	private float offprice;
	private float off;
	
	public Producto() {
		
	}
	
	public Producto(String name, String code, float price, float off) {
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getOff() {
		return off;
	}

	public void setOff(float off) {
		this.off = off;
	}
	
	
	public double getOffprice() {
		return offprice;
	}

	public void setOffprice(float offprice) {
		this.offprice = offprice;
	}

	public float calcularDescuento() {
		
		if (off > 0) {
			
			return price - (off * price)/100;
			
		} else {
			
			return 0.0f;
		}
	}

	@Override
	public String toString() {
		return "\nDetalles del Producto: " + name + "\nCodigo: " + code + "\nPrecio: " + price + "$\nDescuento Aplicado: " + off + "%" + "\nPrecio con descuento: $" + offprice;
	}
	
	
	
}
