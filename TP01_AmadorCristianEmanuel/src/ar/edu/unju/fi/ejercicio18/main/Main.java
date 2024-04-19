package ar.edu.unju.fi.ejercicio18.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import ar.edu.unju.fi.ejercicio18.model.ComparatorDT;
import ar.edu.unju.fi.ejercicio18.model.DestinoTuristico;
import ar.edu.unju.fi.ejercicio18.model.Enum_Pais;
import ar.edu.unju.fi.ejercicio18.model.Pais;

public class Main {
	public static Scanner sc = new Scanner(System.in); // No more scanners
	public static String cadena, pais;
	public static int option;
	public static float price;

	public static void main(String[] args) {

		ArrayList<Pais> paises = new ArrayList<>();
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		generarPaisesAleatorios(paises, 5); // it creates new five random countries

		do {
			selectOption();

			switch (option) {
			case 1:
				altaDestinoTuristico(destinos, paises, sc);
				break;
			case 2:
				mostrarTodo(destinos);
				break;
			case 3:
				modificarPais(destinos, paises);
				break;
			case 4:
				eliminarTodo(destinos);
				break;
			case 5:
				eliminarDestino(destinos, paises);
				break;
			case 6:
				mostrarOrdenado(destinos);
				break;
			case 7:
				mostrarPaises(paises);
				break;
			case 8:
				mostrarDestinosPorPais(destinos, paises);
				break;
			case 9:
				System.err.println("PROGRAMA FINALIZADO");
				break;
			default:
				throw new IllegalArgumentException("OCURRIO UN ERROR EN EL MENU PRINCIPAL " + option);
			}
		} while (option != 9);
		sc.close();
	}

	public static void generarPaisesAleatorios(ArrayList<Pais> paises, int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			Pais pais = generarPaisAleatorio(); // se le asigna el objeto Pais()
			paises.add(pais); // se agrega al arraylist el nuevo objeto
		}
	}

	public static Pais generarPaisAleatorio() {
		Enum_Pais[] valores = Enum_Pais.values(); // Enum_Pais[] values = {AR,BR,...};
		Random random = new Random();
		Enum_Pais paisAleatorio = valores[random.nextInt(valores.length)]; // iterador aleatorio
		return new Pais(paisAleatorio.getCode(), paisAleatorio.getName()); // devuelve un objeto Pais(codigo,nombre)
	}

	public static void menuOptions() { // only_shows_options
		System.out.println("\n-> [ Menu de Opciones ~ Destinos Turisticos ]");
		System.out.println("[1] -> Nuevo Destino");
		System.out.println("[2] -> Mostrar Destinos Disponibles");
		System.out.println("[3] -> Modificar Destino");
		System.out.println("[4] -> Eliminar Todo");
		System.out.println("[5] -> Eliminar un Destino");
		System.out.println("[6] -> Mostrar Destinos Disponibles Ordenado");
		System.out.println("[7] -> Mostrar Paises");
		System.out.println("[8] -> Mostrar Destinos del Pais X");
		System.out.println("[9] -> Salir");
		System.out.println("[?] Ingrese una opcion: ");
	}

	public static void selectOption() { // first code segment
		boolean loop = true;
		do {
			try {
				
				menuOptions();
				option = sc.nextInt();
				if (option < 0 || option > 9) {
					System.err.println("Opcion No Valido, Reintente");
				} else {
					loop = false;
				}
			} catch (Exception e) {
				System.err.println("Error, ingresa un numero valido del menu de opciones.");
				sc.nextLine();
			}
		} while (loop);
	}

	public static void validarFloat(String dato) { 

		boolean loop = true;

		do {
			try {
				System.out.println("Ingrese " + dato + " del destino turistico: ");
				float n = sc.nextFloat();
				if (n < 0) {
					System.out.println("Solo se permiten valores positivos.");
				} else {
					price = n;
					loop = false;
				}
			} catch (Exception e) {
				System.out.println("Debe ingresar un numero con formato: 123,4");
				sc.next();
			} finally {
				System.out.println("Probando finally en la validacion de floats");
			}
		} while (loop);
	}

	public static void validarCadena(String dato) {

		boolean loop = true;

		do {

			try {

				System.out.println("Ingresa el " + dato + " del destino: ");
				String nombre = sc.next();

				if (nombre.matches("[a-zA-Z]+")) { //only letters are accepted
					Main.cadena = nombre;
					if (Main.cadena.length() < 2) {
						System.out.println("Debe ingresar un " + dato + " con al menos 2 caracteres.");
					} else {
						loop = false;
					}

				} else {
					System.out.println("Debe ingresar un " + dato + " valido (solo letras).");
				}

			} catch (Exception e) {
				System.out.println("Debe ingresar una cadena de caracteres.");
			}

		} while (loop);
	}

	public static void mostrarCodigos(ArrayList<Pais> paises) {
		System.out.println("Mostrando codigos de paises disponibles");

		for (Pais p : paises) {
			System.err.print("[" + p.getCode() + "]");
		}
		System.out.println();
	}

	public static void validarCodigo(DestinoTuristico destino, ArrayList<Pais> paises) {

		boolean exist = false, loop = true;
		mostrarCodigos(paises);

		do {

			try {

				System.out.println("Ingresa un codigo: ");
				String nombre = sc.next();

				if (nombre.matches("[A-Z]+")) {
					Main.cadena = nombre;
					if (Main.cadena.length() != 2) {
						System.err.println("Debe ingresar un codigo de DOS CARACTERES. Ej: AR");
					} else {

						for (Pais p : paises) {

							if (p.getCode().equals(cadena)) {
								exist = true;
								destino.setCode(cadena);
								destino.setPais(p);
							}
						}

						if (exist) {
							loop = false;
						} else {
							System.err.println("NO EXISTE EL CODIGO QUE INGRESO, INTENTE NUEVAMENTE");
						}
					}

				} else {
					System.err.println("Debe ingresar un CODIGO valido (solo 2 letras mayusculas: Ej: AR).");
				}

			} catch (Exception e) {
				System.out.println("Debe ingresar una cadena de caracteres mayusculas");
			}

		} while (loop);
	}

	public static void validarDias(DestinoTuristico destino) {
		boolean pass = true;

		do {
			try {
				System.out.println("Ingrese la duracion del destino turistico");
				byte n = sc.nextByte();
				if (n < 0) {
					System.out.println("Solo se permiten valores positivos.");
				} else {
					destino.setDays(n);
					pass = false;
				}
			} catch (Exception e) {
				System.out.println("Debe ingresar un numero entero");
				sc.next();
			}
		} while (pass);
	}

	public static void Datos(DestinoTuristico destino, ArrayList<Pais> paises) {

		validarCodigo(destino, paises);
		destino.setCode(cadena);
		validarCadena("Nombre");
		destino.setName(cadena);
		validarFloat("Precio");
		destino.setPrice(price);
		validarDias(destino);
	}

	public static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises, Scanner sc) {
		DestinoTuristico nuevo = new DestinoTuristico();// creating a new object
		Datos(nuevo, paises);
		destinos.add(nuevo);// adding new element to the array list
		System.out.println(nuevo.toString()); // showing datails
	}

	public static void mostrarTodo(ArrayList<DestinoTuristico> destinos) {
		if (destinos.size() != 0) {
			for (DestinoTuristico x : destinos) {
				System.out.println(x.toString());
			}
		} else {
			System.out.println("No hay destinos registrados");
		}
	}

	public static void existeDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {

		boolean existe = false;

		for (DestinoTuristico x : destinos) {
			if (x.getName().equals(cadena)) {
				existe = true;
				validarCodigo(x, paises); // valida y actualiza automaticamente el codigo y por ende el pais
			}
		}
		if (!existe) {
			System.err.println("No se encontro el destino ingresado, reintente");
		}
	}

	public static void modificarPais(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
		validarCadena("nombre");
		existeDestino(destinos, paises);
	}

	public static void eliminarTodo(ArrayList<DestinoTuristico> destinos) {
		if (destinos.removeAll(destinos)) {
			System.out.println("Los destinos fueron eliminados " + destinos.size());
		} else {
			System.out.println("Los destinos son: " + destinos.size());
		}
	}

	public static void eliminarDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {

		boolean exist = false;
		validarCadena("Nombre"); // importante para actualizar la variable global cadena

		Iterator<DestinoTuristico> iterador = destinos.iterator();

		while (iterador.hasNext()) {

			DestinoTuristico j = iterador.next();

			if (j.getName().equals(cadena)) { // validarCadena() actualiza el valor de cadena
				iterador.remove();
				System.err.println("Destino Turistico Eliminado");
				exist = true;
				return; // se corta la ejecucion
			}
		}

		if (!exist) {
			System.out.println("NO EXISTE EL DESTINO INDICADO");
		}
	}

	public static void mostrarOrdenado(ArrayList<DestinoTuristico> destinos) {

		Collections.sort(destinos, new ComparatorDT());
		for (DestinoTuristico x : destinos) {
			System.out.println(x.toString());
		}

	}

	public static void mostrarPaises(ArrayList<Pais> paises) {
		for (Pais x : paises) {
			System.out.println(x.toString());
		}
	}

	public static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {

		if (destinos.size() != 0) {

			DestinoTuristico x = new DestinoTuristico();
			validarCodigo(x, paises);

			for (DestinoTuristico d : destinos) {
				if (d.getCode().equals(x.getCode())) {
					System.out.println(d.toString());
				}
			}
		} else {
			System.out.println("No hay destinos registrados");
		}
	}
}
