

public  class Rectangulo extends figuras {
private int base;
public int altura;

    public Rectangulo(String color, int base, int altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return super.toString() + ", soy un rectángulo con área " + calcularArea() + " y perímetro " + calcularPerimetro();
    }
}
