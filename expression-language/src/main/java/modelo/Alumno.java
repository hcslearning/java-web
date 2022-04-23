package modelo;

import java.time.LocalDate;

public class Alumno {

	private String nombre;
	private LocalDate fechaNacimiento;

	public Alumno(String nombre, LocalDate fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public Alumno() {
		super();
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
