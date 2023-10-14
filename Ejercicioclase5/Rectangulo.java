package figuras;

public abstract class Rectangulo extends figuras {

	public Rectangulo(String color, int base, int altura) {
		super(color);
		this.altura=altura;
		this.base=base;
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
	public double calcularArea(){
		return base*altura;
	}
	public double calcularPerimetro() {
		return altura+base*2;
	}
	@Override
	public String toString() {
		return " Soy una figura de color"+super.getColor()+""
				+ "Además soy un polígono y un réctangulo con 4 lados: Mi área es"
				+calcularArea()+"y mi perimetro es"+calcularPerimetro()
				 ;
	}
	
	
}
