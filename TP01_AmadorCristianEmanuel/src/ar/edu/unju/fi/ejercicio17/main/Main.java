package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.model.ComparatorJugador;
import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {
	//static ArrayList<Jugador> jugadores = new ArrayList<>();
	static int option = 0;
	static String cadena, name, lastname;
	static float x; //high and height
	
	public static void main(String[] args) {
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		do {
			selectOption(sc);
			
			switch (option) {
			case 1: altaJugador(jugadores, sc);
				break;
			case 2: mostrarJugador(jugadores);
				break;
			case 3: mostrarOrdenado(jugadores);
				break;
			case 4: modificarJugador(jugadores);
				break;
			case 5: eliminarJugador(jugadores); 
				break;
			case 6: System.out.println("Cantidad total de jugadores registrados: " + jugadores.size());
				break;
			case 7: cantJugadoresPorPais(jugadores);
				break;
			case 8: System.err.println("PROGRAMA FINALIZADO");
				break;
			default:
				throw new IllegalArgumentException("OCURRIO UN ERROR EN EL MENU PRINCIPAL " + option);
			}
		} while(option != 8);
		sc.close();
	}
	
	public static void validarFloat(String dato) {
		
		Scanner sc = new Scanner(System.in);
		boolean pass = true;
		
		do {
			try {
				System.out.println("Ingrese -> "+dato+" del jugador: ");
				float n = sc.nextFloat();
				if (n < 0) {
					System.out.println("Solo se permiten valores positivos.");
				} else {
					x = n;
					pass = false;
				}
			} catch (Exception e) {
				System.out.println("Debe ingresar un numero con formato: 123,4");
				sc.next();
			}
		}while(pass);
	}
	
	public static void validarFecha(Jugador j) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean pass = true;
		do {
			try {
				
				System.out.println("Ingresa el DIA de nacimiento: ");
				int dd = sc.nextInt();
				
				if (dd > 0 && dd < 32) {
					
					System.out.println("Ingresa el MES de nacimiento: ");
					int mm = sc.nextInt();
					
					if (mm > 0 && mm < 13) {
						
						System.out.println("Ingresa el ANIO de nacimiento: ");
						int yyyy = sc.nextInt();
						
						if (yyyy > 1900 && yyyy < 2025) {
							
							j.setBirthdate(LocalDate.of(yyyy,mm,dd));
							pass = false;
							
						} else {
							System.err.println("numero de Anio no valido, reintente");
						}
					} else {
						System.err.println("numero de mes no valido, reintente");
					}
				} else {
					System.err.println("dia del mes no valido, reintente");
				}
				
			} catch (Exception e) {
				System.err.println("Debe ingresar unicamente NUMEROS y/o fechas EXISTENTES.");
			}
			
		}while(pass);
	}
	
	public static void validarCadena(String dato) {
		
		Scanner sc = new Scanner(System.in);
		boolean pass = true;
		
		do {
			
			try {
				
				System.out.println("Ingresa el "+dato+" del jugador: ");
				String nombre = sc.next();
				
				if (nombre.matches("[a-zA-Z]+")) {
						Main.cadena = nombre;
                    if (Main.cadena.length() < 3) {
                        System.out.println("Debe ingresar un "+dato+" con al menos 3 caracteres");
                    } else {
                        pass = false;
                    }
                    
                } else {
                    System.out.println("Debe ingresar un "+dato+" válido (solo letras).");
                }
				
			} catch (Exception e) {
				System.out.println("Debe ingresar una cadena de caracteres.");
			}
			
		}while(pass);
	}
	
	public static void juegaComo() {
		System.out.println("Ingresa -1- si juega como delantero");
		System.out.println("Ingresa -2- si juega como medio campista");
		System.out.println("Ingresa -3- si juega como defensor");
		System.out.println("Ingresa -4- si juega como arguero");
	}
	
	public static void validarPosision() {
		
		Scanner sc = new Scanner(System.in);
		boolean pass = true;
		
		do {
			
			try {
				juegaComo();
				int pos = sc.nextInt();
				
				if (pos < 1 || pos > 4) {
					System.out.println("Solo debe ingresar un valor entre [1 - 4]");
				} else {
					option = pos;
					pass = false;
				}
			} catch (Exception e) {
				System.out.println("Debe ingresar unicamente un numero.");
			}
			
		}while(pass);
	}
	
	public static void Datos(Jugador jugador) {
		
		validarCadena("Nuevo Nombre");
		jugador.setName(cadena);
		validarCadena("Nuevo Apellido");
		jugador.setLastname(cadena);
		validarFecha(jugador);
		validarCadena("Pais de origen");
		jugador.setNacionality(cadena);
		validarFloat("estatura");
		jugador.setHigh(x);
		validarFloat("peso");
		jugador.setWeight(x);
		validarPosision();
		
		switch(option) {
		case 1: jugador.setPosition("delantero");
			break;
		case 2: jugador.setPosition("medio");
			break;
		case 3: jugador.setPosition("defensa");
			break;
		case 4: jugador.setPosition("arquero");
			break;
		}
	}
	
	public static void altaJugador(ArrayList<Jugador> jugadores, Scanner sc) {
		Jugador jugador = new Jugador();
		Datos(jugador);
		jugadores.add(jugador);
	}
	
	public static void menuOptions() {
		System.out.println("\n-> [ Menu de Opciones ~ Jugadores ]");
		System.out.println("[1] -> Nuevo Jugador");
		System.out.println("[2] -> Mostrar Datos Jugador");
		System.out.println("[3] -> Mostrar Jugadores");
		System.out.println("[4] -> Modificar Jugador");
		System.out.println("[5] -> Eliminar Jugador");
		System.out.println("[6] -> Total Jugadores");
		System.out.println("[7] -> Jugadores x Nacionalidad");
		System.out.println("[8] -> Salir");
		System.out.println("[?] Ingrese una opcion: ");
	}
	
	public static void selectOption(Scanner sc) {
		boolean wrong = true;
		do {
			try {
				menuOptions();
				option = sc.nextInt();
				if (option < 0 || option > 8) {
					System.err.println("Ingresaste una opcion invalida, intenta nuevamente.");
				} else {
					wrong = false;
				}
			} catch (Exception e) {
				System.err.println("Error, ingresa un numero valido del menu de opciones.");
				sc.nextLine();
			}
		} while (wrong);
	}
	
	public static void validarNyA() {
		validarCadena("nombre");
		Main.name = cadena;
		validarCadena("apellido");
		Main.lastname = cadena;
	}
	
	public static void mostrarJugador(ArrayList<Jugador> jugadores) {
		
		boolean exist = false;
		validarNyA();
		
		for(Jugador x: jugadores) {
			if (x.getName().equals(name) && x.getLastname().equals(lastname)) {
				System.out.println(x.toString());
				exist = true;
			}
		}
		
		if (!exist) {
			System.out.println("El Jugador: " + name + " No existe");
		}
	}
	
	public static void modificarJugador(ArrayList<Jugador> jugadores) {
		
		boolean exist = false;
		validarNyA();
		
		for(Jugador x: jugadores) {
			if (x.getName().equals(name) && x.getLastname().equals(lastname)) {
				System.out.println("ACTUALIZANDO DATOS\n");
				Datos(x);
				exist = true;
			}
		}
		
		if (!exist) {
			System.out.println("El Jugador: " + name + " No existe");
		}
	}
	
	public static void eliminarJugador(ArrayList<Jugador> jugadores) {
		
		boolean exist = false;
		validarNyA();
		
		Iterator<Jugador> iterador = jugadores.iterator();
		
		while(iterador.hasNext()) {
			
			Jugador j = iterador.next();
			
			if (j.getName().equals(name) && j.getLastname().equals(lastname)) {
				iterador.remove();
				System.err.println("Jugador ELIMINADO PARA 100PRE");
				exist = true;
				return;
			}
		}
		
		if (!exist) {
			System.out.println("NO EXISTE EL JUGADOR");
		}
	}
	
	public static void cantJugadoresPorPais(ArrayList<Jugador> jugadores) {
		
		validarCadena("nombre del pais");
		String name = cadena;
		int counter = 0;
		
		for(Jugador x: jugadores) {
			if (x.getNacionality().equals(name)) {
				counter ++;
			}
		}
		
		if (counter == 0) {
			System.out.println("No se encontraron Jugadores de: "+name);
		} else {
			System.out.println("Cantidad de Jugadores de "+name+" son: [" + counter + "]");
		}
	}
	
	public static void mostrarOrdenado(ArrayList<Jugador> jugadores) {
		
		Collections.sort(jugadores, new ComparatorJugador());
		try {

			for(Jugador x: jugadores) {
				System.out.println(x.toString());
			}
		} catch (Exception e) {
			System.err.println("Ocurrio un error en el ordenamiento");
		}
		
	}
}