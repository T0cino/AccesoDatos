
public class Alumnos extends Persona {
	private int nota;

	public Alumnos(String nombre, int nota, int edad, String aula) throws Exception {
		super(nombre, edad, aula);
		this.nota = nota;

	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String toString() {
		return super.toString() + ", nota=" + nota + "]";
	}

}
