package ar.edu.unju.fi.ejercicio17.main;

import java.time.LocalDate;

import ar.edu.unju.fi.ejercicio17.model.Jugador;

public class Main {

	public static void main(String[] args) {
		
		Jugador jugador = new Jugador();
		
		jugador.setName("Xriis");
		jugador.setLastname("Amador");
		jugador.setBirthdate(LocalDate.of(1998, 04, 10));
		jugador.setHigh(170f);
		jugador.setWeight(60f);
		jugador.setNacionality("Argentina");
		jugador.setPosition("Medio");
		
		System.out.println(jugador.toString());
		System.out.println("Edad actual es: "+jugador.calcularEdad());
		
	}

}
