package entity;
import service.Cocinable;
import java.util.List;

public class Receta implements Cocinable {
    private String nombre;
    private int tiempoCoccion;
    private List<Ingrediente> ingredientes; // Cambiado a List
    private String preparacion;

    public Receta(String nombre, int tiempoCoccion, List<Ingrediente> ingredientes, String preparacion) {
        this.nombre = nombre;
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando la receta: " + nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        String ListIngredientes = "";
        for (Ingrediente ingrediente : ingredientes) {
            ListIngredientes += "\n" + ingrediente;
        }
        return "Receta: \nTiempo de coccion: " + tiempoCoccion + "\nIngredientes: " + ListIngredientes + "\nPreparacion: " + preparacion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }
}