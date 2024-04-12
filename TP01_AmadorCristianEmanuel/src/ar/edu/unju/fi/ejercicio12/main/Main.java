package ar.edu.unju.fi.ejercicio12.main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		Persona unaPersona = new Persona();
		
		DateFormat formateador = new SimpleDateFormat("dd/M/yy");
		
		System.out.print("Ingrese su nombre: ");
		unaPersona.setName(sc.next());
		
		System.out.print("Ingrese una fecha con el estilo: \"dd/M/yy\": ");
		Date fecha = formateador.parse(sc.next());
		
		Calendar calendario = new GregorianCalendar();
		
		calendario.setTime(fecha);
		unaPersona.setDate(calendario);
		sc.close();
		System.out.println(unaPersona.toString());
	
	}

}
//Visto en clases
//System.out.println(unaPersona.toS+ "\nSigno Zodiacal: "+unaPersona.zodiacSign(unaPersona.getDate())+ "\nEstacion: "+ unaPersona.yearStation(unaPersona.getDate())tring()+"\n Edad: "+unaPersona.years(unaPersona.getDate().get(Calendar.YEAR)));
/*
DateFormat formateador = new SimpleDateFormat("dd/M/yy");

Date fecha = formateador.parse("11/4/2024");

Calendar calendario = new GregorianCalendar();

calendario.setTime(fecha);

unaPersona.setName("XriisEmanuel");
unaPersona.setDate(calendario);



System.out.println("año Nacimiento: "+unaPersona.getDate().get(Calendar.YEAR));
System.out.println("mes Nacimiento: "+(1 + unaPersona.getDate().get(Calendar.MONTH)));
System.out.println("dia Nacimiento: "+unaPersona.getDate().get(Calendar.DAY_OF_MONTH));

int year = unaPersona.getDate().get(Calendar.YEAR);

unaPersona.getDate().compareTo(calendario);*/
