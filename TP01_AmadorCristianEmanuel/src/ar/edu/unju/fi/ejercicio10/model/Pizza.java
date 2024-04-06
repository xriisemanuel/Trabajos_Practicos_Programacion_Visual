package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private double diameter;
	private double price;
	private double area;
	private boolean special_ingredients;
	private final int special_in_20 = 500;
	private final int special_in_30 = 750;
	private final int special_in_40 = 1000;
	
	public Pizza() {
		
	}
	
	public double getDiameter() {
		return diameter;
	}
	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public boolean isSpecial_ingredients() {
		return special_ingredients;
	}
	public void setSpecial_ingredients(boolean special_ingredients) {
		this.special_ingredients = special_ingredients;
	}
	
	public double calcularPrecio(int option, boolean special) {
	    double precioBase = 0;
	    double precioEspecial = 0;

	    switch (option) {
	        case 1:
	            precioBase = 4500;
	            if (special) {
	                precioEspecial = special_in_20;
	            }
	            break;
	        case 2:
	            precioBase = 4800;
	            if (special) {
	                precioEspecial = special_in_30;
	            }
	            break;
	        case 3:
	            precioBase = 5500;
	            if (special) {
	                precioEspecial = special_in_40;
	            }
	            break;
	        default:
	            // Si la opción no es válida, se puede lanzar una excepción o manejar de alguna otra manera.
	            
	            break;
	    }
	    
	    return precioBase + precioEspecial;
	}
	
	public double calcularArea(double diameter) {
		
		return Math.PI * Math.pow(diameter / 2, 2);
		
	}

	public String toString(int i) {
		return "\n** Pizza Nro: " + i + "\nDiametro: " + diameter + "\nIngredientes Especiales: " + special_ingredients + "\nPrecio Pizza: " + price + "\nArea: " + area + "um";
	}
	
}
