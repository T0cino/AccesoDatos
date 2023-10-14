package figuras;

public abstract class figuras {
	public figuras(String color) {
		this.color=color;
	}
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double perimetro();
	@Override
	public String toString() {
		return "figuras [color=" + color + "]";
	}

		
}
