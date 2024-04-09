package entity;

import java.util.Objects;

public class Ingrediente {
    private String nombre;
    private int cantidad;

    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public void aumentarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
    public void sacar(int cantidad) {
        if (this.cantidad < cantidad) {
            System.out.println("No hay suficiente cantidad de " + this.nombre);
        }
        else {this.cantidad -= cantidad;
    }
    }
    public void agregar(int cantidad) {
        this.cantidad += cantidad;
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
}

