package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Names {

	private String[] names = new String[5];
	private int delet;
	
	public Names() {
		delet = -1;
	}

	public String[] getNames() {
		return names;
	}

	public void setNames(String[] names) {
		this.names = names;
	}

	public int getDelet() {
		return delet;
	}

	public void setDelet(int delet) {
		this.delet = delet;
	}
	
	public void load_names() {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i ++) {
			
			System.out.print("Ingrese el [" + (i + 1) + "] nombre: ");
			names[i] = sc.next();
			
		}
		sc.close();
	}
	
	public void show_names() {
		
		int j = 0;
		
		while( j < names.length ) {
			
			System.out.print("[" + (j + 1) + "]: " + names[j] + " ");
			j ++;
			
		}
		
	}
	
	public int names_lengh() {
		return names.length;
	}
	
	/*
	public void pos_To_Delet() { //consultar
		int delet;
		char r;
		Scanner sc = new Scanner(System.in);
		do {
			
			System.out.print("Ingrese la posicion del nombre que desea eliminar: ");
			delet = sc.nextInt();
			
			if (delet < 1 || delet > 5) {
				
				System.out.println("Error, debe ingresar una posicion valida");
				System.out.println("¿Desea continuar? s/n: ");
				r = sc.next().charAt(0);
				
			} else {
				
				r = 'n';
				this.delet = delet;
			}
			
		} while (r == 's');
		
		sc.close();
	}
	*/
	public void deleting() {
		
		for (int i = 0; i < names.length ; i++) {
			
			if (i >= (delet - 1) && i < names.length - 1) {
				
				names[i] = names[i + 1];
				
			}
			
		}
		
		names[names.length - 1] = "";
	
	}
	
}
