package AccesoDatos.Ejercicio4;

import java.util.Objects;

public class Punto {
    public int x;
    public int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distancia(Punto otroPunto) {
        int deltaX = this.x - otroPunto.getX();
        int deltaY = this.y - otroPunto.getY();
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Punto punto = (Punto) o;
        return x == punto.getX() && y == punto.getY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
