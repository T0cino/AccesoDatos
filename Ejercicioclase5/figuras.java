

public abstract class figuras  {
    public String color;

    public figuras(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Soy una figura de color " + getColor();
    }
}
