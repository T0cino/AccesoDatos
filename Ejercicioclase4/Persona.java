package instituto;

import java.util.Arrays;

public class Persona {
	private String nombre;
	private int edad;
	private String aula;

	public Persona(String nombre, int edad, String aula) throws Exception {

		if (this instanceof Profesor && Arrays.asList(ConstantesJairo.LISTA_PROFESORES).contains(nombre)) {
			this.nombre = nombre;
			this.edad = edad;
			this.aula = aula;
		} else if (this instanceof Alumnos && Arrays.asList(ConstantesJairo.LISTA_ALUMNOS).contains(nombre)) {
			this.nombre = nombre;
			this.edad = edad;
			this.aula = aula;
		} else {
			throw new Exception("La persona " + nombre + " no existe");
		}

		if (this instanceof Profesor && Arrays.asList(ConstantesJairo.LISTA_PROFESORES).contains(nombre)) {
			this.nombre = nombre;
			this.edad = edad;
			this.aula = aula;
		} else if (this instanceof Alumnos && Arrays.asList(ConstantesJairo.LISTA_ALUMNOS).contains(nombre)) {
			this.nombre = nombre;
			this.edad = edad;
			this.aula = aula;
		} else {
			throw new Exception("La persona " + nombre + " no existe");
		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getAula() {
		return aula;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", aula=" + aula;
	}

}
