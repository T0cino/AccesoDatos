package AccesoDatos.Ejercicio3;

public class ParkingTest {
	public static void main(String[] args) {
		VehiculoJairo coche1=new VehiculoJairo("ADE-1113");
		VehiculoJairo coche2=new VehiculoJairo("KDE-1114");
		VehiculoJairo coche3=new VehiculoJairo("DEX-1115");
		VehiculoJairo coche4=new VehiculoJairo("DEE-1116");
		VehiculoJairo coche5=new VehiculoJairo("ADE-1117");
		
		ParkingVehiculoJairo parking1=new ParkingVehiculoJairo("CalleRetrasos , Nº23");
		parking1.aparcaCoche(coche1);
		parking1.aparcaCoche(coche2);
		parking1.aparcaCoche(coche3);
		parking1.aparcaCoche(coche4);
		parking1.aparcaCoche(coche5);
		
		parking1.sacaCoche(coche1);
		parking1.sacaCoche(coche2);
		parking1.sacaCoche(coche3);
		parking1.sacaCoche(coche4);
		parking1.sacaCoche(coche5);
	}
	


}
