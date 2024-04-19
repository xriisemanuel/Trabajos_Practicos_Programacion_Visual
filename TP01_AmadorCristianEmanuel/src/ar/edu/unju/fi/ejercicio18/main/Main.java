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
	
	public static Scanner sc = new Scanner(System.in);
	public static String cadena, pais;
	public static int option = 7;
	public static float price;
	
	public static void main(String[] args) {
		
		ArrayList<Pais> paises = new ArrayList<>();
		paises.addAll(generarPaisesAleatorios(option)); //se generan 7 paises y sus respectivos codigos
		
		ArrayList<DestinoTuristico> destinos = new ArrayList<>();
		
		do {
			selectOption(sc);
			
			switch (option) {
			case 1: altaDestinoTuristico(destinos, paises, sc);
				break;
			case 2: mostrarTodo(destinos);
				break;
			case 3: modificarPais(destinos, paises);
				break;
			case 4: eliminarTodo(destinos);
				break;
			case 5: eliminarDestino(destinos, paises);
				break;
			case 6: mostrarOrdenado(destinos);
				break;
			case 7: mostrarPaises(paises);
				break;
			case 8: mostrarDestinosPorPais(destinos, paises);
				break;
			case 9: System.err.println("PROGRAMA FINALIZADO");
				break;
			default:
				throw new IllegalArgumentException("OCURRIO UN ERROR EN EL MENU PRINCIPAL " + option);
			}
		} while(option != 9);
	}
	
	public static void mostrarDestinosPorPais(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
		
		if (destinos.size() != 0) {
			
			DestinoTuristico x = new DestinoTuristico();
			validarCodigo(x, paises);
			
			for (DestinoTuristico d: destinos) {
				if (d.getCode().equals(x.getCode())) {
					System.out.println(d.toString());
				}
			}
		} else {
			System.out.println("No hay destinos registrados");
		}
	}
	
	public static void mostrarPaises(ArrayList<Pais> paises) {
		for (Pais x: paises) {
			System.out.println(x.toString());
		}
	}
	
	public static void mostrarOrdenado(ArrayList<DestinoTuristico> destinos) {
		
		Collections.sort(destinos, new ComparatorDT());
		try {

			for(DestinoTuristico x: destinos) {
				System.out.println(x.toString());
			}
		} catch (Exception e) {
			System.err.println("Ocurrio un error en el ordenamiento");
		}
		
	}
	
	public static void eliminarDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
		
		boolean exist = false;
		validarCadena("Nombre");
		
		Iterator<DestinoTuristico> iterador = destinos.iterator();
		
		while(iterador.hasNext()) {
			
			DestinoTuristico j = iterador.next();
			
			if (j.getName().equals(cadena)) {
				iterador.remove();
				System.err.println("Destino Turistico Eliminado");
				exist = true;
				return;
			}
		}
		
		if (!exist) {
			System.out.println("NO EXISTE EL DESTINO INDICADO");
		}
	}
	
	public static void eliminarTodo(ArrayList<DestinoTuristico> destinos) {
		if (destinos.removeAll(destinos)) {
			System.out.println("Los destinos fueron eliminados "+destinos.size());
		} else {
			System.out.println("Los destinos son: " + destinos.size());
		}
	}
	
	public static void existeDestino(ArrayList<DestinoTuristico> destinos, ArrayList<Pais> paises) {
		
		boolean existe = false;
		
		for (DestinoTuristico x: destinos) {
			if (x.getName().equals(cadena)) {
				existe = true;
				validarCodigo(x, paises);
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
	
    public static ArrayList<Pais> generarPaisesAleatorios(int cantidad) {
        ArrayList<Pais> paises = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            Pais pais = generarPaisAleatorio();
            paises.add(pais);
        }
        return paises;
    }

    public static Pais generarPaisAleatorio() {
        Enum_Pais[] valores = Enum_Pais.values();
        Random random = new Random();
        Enum_Pais paisAleatorio = valores[random.nextInt(valores.length)];
        return new Pais(paisAleatorio.getCode(), paisAleatorio.getName());
    }
    
    public static void mostrarTodo(ArrayList<DestinoTuristico> destinos) {
    	for (DestinoTuristico x: destinos) {
    		System.out.println(x.toString());
    	}
    }
    
	public static void validarFloat(String dato) {
		
		Scanner sc = new Scanner(System.in);
		boolean pass = true;
		
		do {
			try {
				System.out.println("Ingrese -> "+dato+" del destino turistico: ");
				float n = sc.nextFloat();
				if (n < 0) {
					System.out.println("Solo se permiten valores positivos.");
				} else {
					price = n;
					pass = false;
				}
			} catch (Exception e) {
				System.out.println("Debe ingresar un numero con formato: 123,4");
				sc.next();
			}
		}while(pass);
	}
    
    public static void validarCadena(String dato) {
		
		Scanner sc = new Scanner(System.in);
		boolean pass = true;
		
		do {
			
			try {
				
				System.out.println("Ingresa el "+dato+" del destino: ");
				String nombre = sc.next();
				
				if (nombre.matches("[a-zA-Z]+")) {
						Main.cadena = nombre;
                    if (Main.cadena.length() < 2) {
                        System.out.println("Debe ingresar un "+dato+" con al menos 2 caracteres");
                    } else {
                        pass = false;
                    }
                    
                } else {
                    System.out.println("Debe ingresar un "+dato+" valido (solo letras mayusculas: Ej: AR).");
                }
				
			} catch (Exception e) {
				System.out.println("Debe ingresar una cadena de caracteres.");
			}
			
		}while(pass);
	}
    
    public static void mostrarCodigos(ArrayList<Pais> paises) {
		System.out.println("Mostrando codigos de paises disponibles");
		
		for (Pais p: paises) {
			System.err.print("[" + p.getCode() + "]");
		}
		System.out.println();
    }
    public static void validarCodigo(DestinoTuristico destino, ArrayList<Pais> paises) {
		
		Scanner sc = new Scanner(System.in);
		boolean exist = false ,pass = true;
		mostrarCodigos(paises);
		
		do {
			
			try {
				
				System.out.println("Ingresa el codigo para el nuevo destino: ");
				String nombre = sc.next();
				
				if (nombre.matches("[A-Z]+")) {
						Main.cadena = nombre;
                    if (Main.cadena.length() != 2) {
                        System.err.println("Debe ingresar un codigo de dos caracteres. Ej: AR");
                    } else {
                    	
                    	for(Pais p: paises) {
                    		
                    		if (p.getCode().equals(cadena)) {
                    			exist = true;
                    			destino.setCode(cadena);
                    			destino.setPais(p);
                    		}
                    	}
                    	
                    	if (exist) {
                    		pass = false;
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
			
		}while(pass);
	}
    
    public static void validarDias(DestinoTuristico destino) {
		Scanner sc = new Scanner(System.in);
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
		}while(pass);
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
	
	public static void altaDestinoTuristico(ArrayList<DestinoTuristico> destinos,ArrayList<Pais> paises, Scanner sc) {
		DestinoTuristico nuevo = new DestinoTuristico();
		Datos(nuevo, paises);
		destinos.add(nuevo);
		System.out.println(nuevo.toString());
	}
	
	public static void menuOptions() {
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
	
	public static void selectOption(Scanner sc) {
		boolean wrong = true;
		do {
			try {
				menuOptions();
				option = sc.nextInt();
				if (option < 0 || option > 9) {
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
}
