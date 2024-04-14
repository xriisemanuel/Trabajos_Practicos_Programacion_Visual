package ar.edu.unju.fi.ejercicio10.model;

public class Pizza {
	
	private float diameter;
	private float price;
	private float area;
	private boolean special_ingredients;
	private final short SPECIAL_IN_20 = 500;
	private final short SPECIAL_IN_30 = 750;
	private final short SPECIAL_IN_40 = 1000;
	
	public Pizza() {
		
	}
	
	public float getDiameter() {
		return diameter;
	}
	public void setDiameter(float diameter) {
		this.diameter = diameter;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	public boolean isSpecial_ingredients() {
		return special_ingredients;
	}
	public void setSpecial_ingredients(boolean special_ingredients) {
		this.special_ingredients = special_ingredients;
	}
	
	public float calcularPrecio(byte option) {//nueva corrección de clase, aplicado. 
	    float precioBase = 0;
	    float precioEspecial = 0;

	    switch (option) {
	        case 1:
	            precioBase = 4500;
	            if (special_ingredients) {
	                precioEspecial = SPECIAL_IN_20;
	            }
	            break;
	        case 2:
	            precioBase = 4800;
	            if (special_ingredients) {
	                precioEspecial = SPECIAL_IN_30;
	            }
	            break;
	        case 3:
	            precioBase = 5500;
	            if (special_ingredients) {
	                precioEspecial = SPECIAL_IN_40;
	            }
	            break;
	        default:
	            // Si la opción no es válida, se puede lanzar una excepción o manejar de alguna otra manera.
	            
	            break;
	    }
	    
	    return (float)precioBase + precioEspecial;
	}
	
	public double calcularArea(float diameter) {
		
		return Math.PI * Math.pow(diameter / 2, 2);
		
	}

	public String toString(byte i) {
		return "\n** Pizza Nro: " + i + "\nDiametro: " + diameter + "\nIngredientes Especiales: " + special_ingredients + "\nPrecio Pizza: " + price + "\nArea: " + area + "um";
	}
	
}
