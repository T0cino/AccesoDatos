package AccesoDatos.Ejercicio3;
import java.util.Calendar;

public class VehiculoJairo {

	private String matricula;
	private Calendar fechaInico;
	private Calendar fechaFin;
	
	public VehiculoJairo(String matricula) {
		this.matricula=matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Calendar getFechaInico() {
		return fechaInico;
	}

	public void setFechaInico(Calendar fechaInico) {
		this.fechaInico = fechaInico;
	}

	public Calendar getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Calendar fechaFin) {
		this.fechaFin = fechaFin;
	}

	@Override
	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", fechaInico=" + fechaInico + ", fechaFin=" + fechaFin + "]";
	}
	
}
