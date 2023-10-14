package AccesoDatos.Ejercicio2;
public class Ordenador {
    private int codigo;
    private int ram;
    private String cpu;
    private double precio;

    public Ordenador(int codigo, int ram, String cpu, double precio) {
        this.codigo = codigo;
        this.ram = ram;
        this.cpu = cpu;
        this.precio = precio;
    }

    public String getCaracteristicas() {
        return "Código: " + codigo + ", RAM: " + ram + "GB, CPU: " + cpu + ", Precio: $" + precio;
    }

    @Override
    public String toString() {
        return "Ordenador: " + getCaracteristicas();
    }
}
