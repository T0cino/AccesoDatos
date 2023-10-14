public class Principal {
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo("Rojo", 4, 5);
        Circulo circulo = new Circulo("Azul", 3.0);
        Triangulo triangulo = new Triangulo("Verde", 3.0, 4.0, 5.0);

        System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Área del círculo: " + circulo.calcularArea());
        System.out.println("Área del triángulo: " + triangulo.calcularArea());
    }
}
