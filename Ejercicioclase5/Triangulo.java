package figuras;

public abstract class Triangulo extends figuras {
	
	public Triangulo(String color) {
		super(color);
		// TODO Auto-generated constructor stub
	}
	private int base;
	private int altura;
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	@Override
	public String toString() {
		return "Triangulo [base=" + base + ", altura=" + altura + "]";
	}
	
}
