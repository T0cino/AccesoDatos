package AccesoDatos.Ejercicio2;

public class Sobremesa extends Ordenador {
    private String tipoTorre;

    public Sobremesa(int codigo, int ram, String cpu, double precio, String tipoTorre) {
        super(codigo, ram, cpu, precio);
        this.tipoTorre = tipoTorre;
    }

    @Override
    public String getCaracteristicas() {
        return super.getCaracteristicas() + ", Tipo de torre: " + tipoTorre;
    }

    @Override
    public String toString() {
        return "Ordenador de sobremesa: " + getCaracteristicas();
    }
}
