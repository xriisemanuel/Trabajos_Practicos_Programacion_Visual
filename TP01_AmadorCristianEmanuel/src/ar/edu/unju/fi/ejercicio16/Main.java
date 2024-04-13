package ar.edu.unju.fi.ejercicio16;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Names array = new Names();
		
		array.load_names();
		array.show_names();
		System.out.println("\nEl tamanio del arreglo de nombres es: " + array.names_lengh());
		array.setDelet(array.pos_delet());
		if ( array.getDelet() > 0 && array.getDelet() < 6) {
			array.deleting();
			array.show_names();
		}
	}
}
