

public  class Triangulo extends figuras {
	
	public double lado1;
    public double lado2;
    public double lado3;

    public Triangulo(String color, double lado1, double lado2, double lado3) {
        super(color);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public double calcularArea() {
        // Implementa el cálculo del área de un triángulo (por ejemplo, usando la fórmula de Herón)
        // Ten en cuenta que esta implementación dependerá del tipo de triángulo (equilátero, isósceles, escaleno).
        return 0.0;
    }

    @Override
    public double calcularPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return super.toString() + ", soy un triángulo con área " + calcularArea() + " y perímetro " + calcularPerimetro();
    }
}