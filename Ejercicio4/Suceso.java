

import java.util.Objects;

public class Suceso extends Punto3D {
    private String descripcion;
    private String tiempo;

    public Suceso(int x, int y, int z, String descripcion, String tiempo) {
        super(x, y, z);
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Suceso suceso = (Suceso) o;
        return Objects.equals(descripcion, suceso.descripcion) && Objects.equals(tiempo, suceso.tiempo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), descripcion, tiempo);
    }
}
