package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Names {

	private String[] names = new String[5];
	private byte delet;
	
	public Names() {
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

	public void setDelet(byte delet) {
		this.delet = delet;
	}
	
	public void load_names() {
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < names.length; i ++) {
			
			System.out.print("Ingrese el [" + (i + 1) + "] nombre: ");
			names[i] = sc.next();
			sc.nextLine();
		}
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
	
	public byte pos_delet() {
		byte del = 0;
		char answer;
		Scanner sc = new Scanner(System.in);
		
		do {
			//sc.nextLine();
			System.out.print("Ingrese la posicion del nombre que desea eliminar: ");
			del = sc.nextByte();
			sc.nextLine();
			
			if (del < 1 || del > 5) {
				
				System.out.println("Error, debe ingresar una posicion valida");
				System.out.println("¿Desea continuar? s/n: ");
				answer = sc.next().charAt(0);
				
			} else {
				
				answer = 'n';
			}
			
		} while (answer == 's');
		
		//sc.close();
		return del;
	}
	
	public void deleting() {
		
		for (int i = 0; i < names.length ; i++) {
			
			if (i >= (delet - 1) && i < names.length - 1) {
				
				names[i] = names[i + 1];
				
			}
			
		}
		
		names[names.length - 1] = "";
	
	}
	
}
