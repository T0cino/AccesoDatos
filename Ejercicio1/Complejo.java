package AccesoDatos.Ejercicio1;

public class Complejo {
    
        private double dPReal;
        private double dPImag;
    
        // Constructor por defecto
        public Complejo() {
            this.dPReal = 0.0;
            this.dPImag = 0.0;
        }
    
        // Constructor con parámetros
        public Complejo(double dPReal, double dPImag) {
            this.dPReal = dPReal;
            this.dPImag = dPImag;
        }
    
        // Método para asignar valores a la parte real e imaginaria
        public void asignar(double x, double y) {
            this.dPReal = x;
            this.dPImag = y;
        }
    
        // Método para sumar dos números complejos y retornar un nuevo objeto Complejo
        public Complejo sumar(Complejo c1, Complejo c2) {
            double realSum = c1.dPReal + c2.dPReal;
            double imagSum = c1.dPImag + c2.dPImag;
            return new Complejo(realSum, imagSum);
        }
    
        // Método para imprimir el número complejo
        public void imprimir() {
            System.out.println("Número complejo: " + dPReal + " + " + dPImag + "i");
        }
    
        public static void main(String[] args) {
            Complejo complejo1 = new Complejo(2.0, 3.0);
            Complejo complejo2 = new Complejo(1.0, 1.0);
    
            complejo1.imprimir();
            complejo2.imprimir();
    
            Complejo suma = complejo1.sumar(complejo1, complejo2);
            suma.imprimir();
        }
    
    
}
