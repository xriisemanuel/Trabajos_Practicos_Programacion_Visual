package ar.edu.unju.fi.ejercicio17.model;

import java.util.Comparator;

public class ComparatorJugador implements Comparator<Jugador>{

	@Override
	public int compare(Jugador j1, Jugador j2) {
		
		if (j1.getLastname().compareTo(j2.getLastname()) > 0) {
			
			return 1;
			
		} else if (j1.getLastname().compareTo(j2.getLastname()) < 0){
			
			return -1;
			
		} else {
			
			return 0;
			
		}
	}

}
