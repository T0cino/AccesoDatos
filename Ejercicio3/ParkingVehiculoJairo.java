package AccesoDatos.Ejercicio3;

import java.util.Calendar;

public class ParkingVehiculoJairo implements ParkingJairo {
	private String direccion;
	private static int plazasActuales=0;

	private static final double precioxMin=0.0425;
	private static final int maxPlazas=100;
	
	public ParkingVehiculoJairo(String string) {
		// TODO Auto-generated constructor stub
	}

	public void ParkingVehiculoKevin(String direccion){
		this.direccion= direccion;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public boolean hayPlaza() {
		return plazasActuales<maxPlazas;
	}


	public void aparcaCoche(VehiculoJairo coche) {
		if(hayPlaza()==true) {
			coche.setFechaInico(Calendar.getInstance());
			plazasActuales++;
		}else {
			System.out.println("No hay plaza para aparcar");
		}
	}

	public void sacaCoche(VehiculoJairo coche) {
		if(plazasActuales>0 && hayPlaza()==true) {
			coche.setFechaFin(Calendar.getInstance());
			plazasActuales--;
		}else {
			System.out.println("No hay ningun vehículo aparcado");
		}
	}

	@Override
	public double getFactura(VehiculoJairo coche) {
		// TODO Auto-generated method stub
		return 0;
	}
}