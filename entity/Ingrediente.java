package entity;

import service.Despensable;
import java.util.Objects;

public class Ingrediente implements Despensable {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public String toString() {
        return "Ingrediente [cantidad=" + cantidad + ", nombre=" + nombre + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingrediente that = (Ingrediente) o;
        return nombre.equals(that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    @Override
    public void setCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }
}

