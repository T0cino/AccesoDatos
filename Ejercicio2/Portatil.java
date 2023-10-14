public class Portatil extends Ordenador {
    private double peso;

    public Portatil(int codigo, int ram, String cpu, double precio, double peso) {
        super(codigo, ram, cpu, precio);
        this.peso = peso;
    }

    @Override
    public String getCaracteristicas() {
        return super.getCaracteristicas() + ", Peso: " + peso + "kg";
    }

    @Override
    public String toString() {
        return "Portátil: " + getCaracteristicas();
    }
}
