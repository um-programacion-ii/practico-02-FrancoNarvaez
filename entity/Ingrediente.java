package entity;

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
}
