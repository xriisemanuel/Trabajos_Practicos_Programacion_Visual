package ar.edu.unju.fi.ejercicio8.model;

public class CalculadoraEspecial {
	
	private int n;
	
	public CalculadoraEspecial() {
		
	}
	
	public CalculadoraEspecial(int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	public int calcularSumatoria(int n) {
		
		int acumulador = 0;
		
		for (int k = 1; k <= n; k ++) {
			
			acumulador += (int)Math.pow( (double)( k * ( k + 1 ) / 2 ) , 2 );
			
		}
		return acumulador;
	}

	public int calcularProductoria(int n) {
		
		int acumulador = 1;
		
		for (int k = 1; k <= n; k ++) {
			
			acumulador *= k * (k + 4);
			
		}
		return acumulador;
	}

}
