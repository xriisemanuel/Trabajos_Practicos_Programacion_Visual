package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String name;
	private Calendar date;
	
	public Persona() {};
	
	public Persona(String name, Calendar date) {
		super();
		this.name = name;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	
	public int years(int year) {
		
		Calendar hoy = Calendar.getInstance();
		return hoy.get(Calendar.YEAR) - year;
		
	}
	
	public String zodiacSign() {
		
		Calendar fecha_inicio = Calendar.getInstance();
		Calendar fecha_fin = Calendar.getInstance();
		
		int year = date.get(Calendar.YEAR);
		
		fecha_inicio.set(year,2,21);
		fecha_fin.set(year,3,19);
		if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
			return "Aries";
		} else {
			fecha_inicio.set(year,3,20);
			fecha_fin.set(year,4,20);
			if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
				return "Tauro";
			} else {
				fecha_inicio.set(year,4,21);
				fecha_fin.set(year,5,20);
				if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
					return "Geminis";
				} else {
					fecha_inicio.set(year,5,21);
					fecha_fin.set(year,6,22);
					if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
						return "Cancer";
					} else {
						fecha_inicio.set(year,6,23);
						fecha_fin.set(year,7,22);
						if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
							return "Leo";
						} else {
							fecha_inicio.set(year,6,23);
							fecha_fin.set(year,7,22);
							if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
								return "Virgo";
							} else {
								fecha_inicio.set(year,7,23);
								fecha_fin.set(year,9,22);
								if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
									return "Libra";
								} else {
									fecha_inicio.set(year,9,23);
									fecha_fin.set(year,10,21);
									if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
										return "Escorpio";
									} else {
										fecha_inicio.set(year,10,22);
										fecha_fin.set(year,11,21);
										if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
											return "Sagitario";
										} else {
											fecha_inicio.set(year,11,22);
											fecha_fin.set(year,0,19);
											if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
												return "Capricornio";
											} else {
												fecha_inicio.set(year,0,20);
												fecha_fin.set(year,1,19);
												if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
													return "Acuario";
												} else {
													fecha_inicio.set(year,1,20);
													fecha_fin.set(year,2,20);
													if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
														return "Piscis";
													} else {
														return "Error de signo Zodiacal";
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	public String yearStation(Calendar date) {
		
		Calendar fecha_inicio = Calendar.getInstance();
		Calendar fecha_fin = Calendar.getInstance();
		
		fecha_inicio.set(date.get(Calendar.YEAR),2,21);
		fecha_fin.set(date.get(Calendar.YEAR),5,20);
		if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
			return "Otonio";
		} else {
			fecha_inicio.set(date.get(Calendar.YEAR),5,21);
			fecha_fin.set(date.get(Calendar.YEAR),8,20);
			if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
				return "Invierno";
			} else {
				fecha_inicio.set(date.get(Calendar.YEAR),8,21);
				fecha_fin.set(date.get(Calendar.YEAR),11,20);
				if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
					return "Primavera";
				} else {
					fecha_inicio.set(date.get(Calendar.YEAR),11,21);
					fecha_fin.set(date.get(Calendar.YEAR),2,20);
					if ((date.after(fecha_inicio)) && (date.before(fecha_fin))) {
						return "Verano";
					} else {
						return "Error al elegir estacion";
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		return "\nDatos de: " + name + "\nFecha nacimiento: " + date.get(Calendar.DAY_OF_MONTH)+"/"+date.get(Calendar.MONTH) +"/"+date.get(Calendar.YEAR);
	}
	
	
}
