package figuras;

public abstract class Circulo extends figuras {
	public Circulo(String color, double radio) {
		super(color);
		this.radio=radio;
		
	}
		private double radio;

		public double getRadio() {
			return radio;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}
		
		public  double calcularPerimetro() {
			return Math.PI*2*radio;
		}
		public double calcularArea() {
			return radio*Math.PI;
		}

		@Override
		public String toString() {
			return  " Soy una figura de color"+super.getColor()+""
					+ "Adem�s soy un pol�gono y un r�ctangulo con 4 lados: Mi �rea es"
					+calcularArea()+"y mi perimetro es"+calcularPerimetro()
					 ;
		}
		
		
}
