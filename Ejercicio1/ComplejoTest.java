package AccesoDatos.Ejercicio1;

public class ComplejoTest {
    public static void main(String[] args) {
        Complejo numero1 = new Complejo(20, 20);
        Complejo numero2 = new Complejo(30, 30);
        
        Complejo numero3 = new Complejo(); 

        numero3.asignar(20.0, 20.0); 

        System.out.println("La suma de número1 y número2 es " + numero1.sumar(numero1, numero2));
        System.out.println("Número complejo 1:");
        numero1.imprimir();
        System.out.println("Número complejo 2:");
        numero2.imprimir();
        System.out.println("Número complejo 3:");
        numero3.imprimir();
        
        numero3.asignar(100, 100);
        System.out.println("Número complejo 3 después de la asignación:");
        numero3.imprimir();
    }
}
