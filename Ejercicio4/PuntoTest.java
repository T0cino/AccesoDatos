package AccesoDatos.Ejercicio4;

public class PuntoTest {
    public static void main(String[] args) {
        // Crear un objeto Punto en el plano 2D
        Punto punto2D1 = new Punto(2, 3);
        Punto punto2D2 = new Punto(4, 5);

        // Calcular la distancia entre los puntos en el plano 2D
        double distancia2D = punto2D1.distancia(punto2D2);
        System.out.println("Distancia entre los puntos en el plano 2D: " + distancia2D);

        // Verificar si los puntos 2D son iguales
        boolean sonIguales2D = punto2D1.equals(punto2D2);
        System.out.println("¿Los puntos 2D son iguales? " + sonIguales2D);

        // Crear un objeto Punto3D en el espacio 3D
        Punto3D punto3D1 = new Punto3D(1, 2, 3);
        Punto3D punto3D2 = new Punto3D(4, 5, 6);

        // Calcular la distancia entre los puntos en el espacio 3D
        double distancia3D = punto3D1.distancia(punto3D2);
        System.out.println("Distancia entre los puntos en el espacio 3D: " + distancia3D);

        // Verificar si los puntos 3D son iguales
        boolean sonIguales3D = punto3D1.equals(punto3D2);
        System.out.println("¿Los puntos 3D son iguales? " + sonIguales3D);

        // Crear un objeto Suceso en el espacio 3D con información adicional
        Suceso suceso1 = new Suceso(10, 20, 30, "Evento importante", "2023-10-14 12:00 PM");
        Suceso suceso2 = new Suceso(10, 20, 30, "Evento importante", "2023-10-14 12:00 PM");
        
        // Verificar si los sucesos son iguales
        boolean sonSucesosIguales = suceso1.equals(suceso2);
        System.out.println("¿Los sucesos son iguales? " + sonSucesosIguales);
    }
}
