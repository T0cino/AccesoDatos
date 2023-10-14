package AccesoDatos.Ejercicio4;

import java.util.Objects;

public class Punto3D extends Punto {
    private int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distancia(Punto otroPunto) {
        if (otroPunto instanceof Punto3D) {
            Punto3D punto3D = (Punto3D) otroPunto;
            int deltaX = this.x - punto3D.x;
            int deltaY = this.y - punto3D.y;
            int deltaZ = this.z - punto3D.z;
            return Math.sqrt(deltaX * deltaX + deltaY * deltaY + deltaZ * deltaZ);
        } else {
            return super.distancia(otroPunto);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Punto3D punto3D = (Punto3D) o;
        return z == punto3D.z;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), z);
    }
}

