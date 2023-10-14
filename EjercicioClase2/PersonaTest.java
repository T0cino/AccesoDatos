
import java.util.Scanner;

public class PersonaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir por teclado nombre, edad, sexo, peso y altura
        System.out.print("Ingrese nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese edad: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese sexo (H para hombre, M para mujer): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Ingrese peso (en kg): ");
        double peso = scanner.nextDouble();
        System.out.print("Ingrese altura (en metros): ");
        double altura = scanner.nextDouble();

        // Crear un objeto Persona con los datos ingresados
        Persona persona1 = new Persona(nombre, edad, nombre, sexo, peso, altura);

        // Crear un objeto Persona con nombre, edad y sexo
        Persona persona2 = new Persona("Juan", 30, 'H');

        // Crear un objeto Persona con el constructor por defecto y asignar valores con los setters
        Persona persona3 = new Persona();
        persona3.setNombre("Ana");
        persona3.setEdad(25);
        persona3.setSexo('M');
        persona3.setPeso(60.0);
        persona3.setAltura(1.65);

        // Calcular y mostrar el IMC para cada persona
        int imc1 = persona1.calcularIMC();
        int imc2 = persona2.calcularIMC();
        int imc3 = persona3.calcularIMC();

        System.out.println("IMC de " + persona1.getNombre() + ": " + imc1);
        System.out.println("IMC de " + persona2.getNombre() + ": " + imc2);
        System.out.println("IMC de " + persona3.getNombre() + ": " + imc3);

        // Mostrar los datos de cada persona por pantalla
        System.out.println("\nDatos de persona1:\n" + persona1.toString());
        System.out.println("\nDatos de persona2:\n" + persona2.toString());
        System.out.println("\nDatos de persona3:\n" + persona3.toString());
    }
}

