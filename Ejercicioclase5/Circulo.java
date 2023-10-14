

public  class Circulo extends figuras {
	  public double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public String toString() {
        return super.toString() + ", soy un círculo con área " + calcularArea() + " y perímetro " + calcularPerimetro();
    }
}
