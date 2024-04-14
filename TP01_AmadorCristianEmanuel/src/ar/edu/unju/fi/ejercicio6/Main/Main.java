package ar.edu.unju.fi.ejercicio6.Main;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio6.Model.Persona;

public class Main {

	public static void main(String[] args) {
		
//presento la opcion uno de desarrollo, la opcion 2 se encuentra al final del codigo...
		
		byte opcion = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese 1 -> Crear Objeto con constructor por defecto.");
		System.out.println("Ingrese 2 -> Crear Objeto con constructor parametrizado.");
		System.out.println("Ingrese 3 -> Crear Objeto con constructor sin definir la provincia.");
		System.out.print("Ingrese una opcion para continuar: ");
		opcion = sc.nextByte();
		
		switch (opcion) {
		
		case 1:
			
			const_por_defecto();
			break;
		
		case 2:
			
			const_parametrizado();
			break;
		
		case 3: 
			
			const_sin_provincia();
			break;
			
		default:
			System.out.println("¡¡Error!!, debe elegir una opcion valida, reintente ejecutar nuevamente...");;
		}
		
		sc.close();
	}
	
	public static void const_sin_provincia() {
		
		String name;
		LocalDate born;
		int year, month, day, dni;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		name = sc.next();

		System.out.print("Ingrese un DNI: ");
		dni = sc.nextInt();
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		year = sc.nextInt();
		System.out.print("Mes: ");
		month = sc.nextInt();
		System.out.print("Dia: ");
		day = sc.nextInt();
		born = LocalDate.of(year, month, day);
		
		Persona Cris = new Persona(dni, name, born);
		
		System.out.println(Cris.toString());
		
		sc.close();
		
	}
	
	public static void const_parametrizado() {
	
		String name, province;
		LocalDate born;
		int year, month, day, dni;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		name = sc.next();

		System.out.print("Ingrese un DNI: ");
		dni = sc.nextInt();
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		year = sc.nextInt();
		System.out.print("Mes: ");
		month = sc.nextInt();
		System.out.print("Dia: ");
		day = sc.nextInt();
		
		born = LocalDate.of(year, month, day);
		
		System.out.println("Ingrese la provincia: ");
		province = sc.next();
		
		Persona Xriis = new Persona(dni,name,born,province);
		
		System.out.println(Xriis.toString());
		
		sc.close();
		
	}
	public static void const_por_defecto() {

		int year, month, day;
		
		Scanner sc = new Scanner(System.in);
		
		Persona Xriis = new Persona();
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		Xriis.setName(sc.nextLine());

		System.out.print("Ingrese un DNI: ");
		Xriis.setDni(sc.nextInt());
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		year = sc.nextInt();
		System.out.print("Mes: ");
		month = sc.nextInt();
		System.out.print("Dia: ");
		day = sc.nextInt();
		
		Xriis.setBorn(LocalDate.of(year, month, day));
		
		System.out.println("Ingrese la provincia: ");
		Xriis.setProvince(sc.next());
		
		System.out.println(Xriis.toString());
		
		sc.close();

	}

}

//presento la opcion 2 de desarrollo

		//String name, province;
		//LocalDate born;
		//int year, month, day, dni;
		
		// crear objeto con el constructor por defecto
		
		/*
		Persona Xriis = new Persona();
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		Xriis.setName(sc.nextLine());

		System.out.print("Ingrese un DNI: ");
		Xriis.setDni(sc.nextInt());
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		year = sc.nextInt();
		System.out.print("Mes: ");
		month = sc.nextInt();
		System.out.print("Dia: ");
		day = sc.nextInt();
		
		Xriis.setBorn(LocalDate.of(year, month, day));
		
		System.out.println("Ingrese la provincia: ");
		Xriis.setProvince(sc.next());
		
		System.out.println(Xriis.toString());
		
		*/
		
		// crear objeto con el constructor de solo 3 parametros
		
		/*
		 * 
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		name = sc.next();

		System.out.print("Ingrese un DNI: ");
		dni = sc.nextInt();
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		year = sc.nextInt();
		System.out.print("Mes: ");
		month = sc.nextInt();
		System.out.print("Dia: ");
		day = sc.nextInt();
		born = LocalDate.of(year, month, day);
		
		Persona Cris = new Persona(dni, name, born);
		
		System.out.println(Cris.toString());
		
		*/
		
		//Creando Objeto con todos sus parametros a pedido
		/*
		 * 
		 
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		name = sc.next();

		System.out.print("Ingrese un DNI: ");
		dni = sc.nextInt();
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		year = sc.nextInt();
		System.out.print("Mes: ");
		month = sc.nextInt();
		System.out.print("Dia: ");
		day = sc.nextInt();
		
		born = LocalDate.of(year, month, day);
		
		System.out.println("Ingrese la provincia: ");
		province = sc.next();
		
		Persona Xriis = new Persona(dni,name,born,province);
		
		System.out.println(Xriis.toString());
		
		
		*/
	/*
	public static void load_values(Persona p, Scanner sc) {
		
		
		
		System.out.println("**************************");
		System.out.println("Cargando Nuevos Datos");
		System.out.print("Ingrese un nombre: ");
		name = sc.next();

		System.out.print("Ingrese un DNI: ");
		dni = sc.nextInt();
		
		System.out.print("Ingrese Datos de la edad: ");
		System.out.print("\nAnio: ");
		year = sc.nextInt();
		System.out.print("Mes: ");
		month = sc.nextInt();
		System.out.print("Dia: ");
		day = sc.nextInt();
		
		born = LocalDate.of(year, month, day);
		
	} */
	