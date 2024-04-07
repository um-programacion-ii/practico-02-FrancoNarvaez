package entity;
import service.Cocinable;
import java.util.Map;

public class Receta implements Cocinable {
    private String nombre;
    private int tiempoCoccion;
    private Map<Ingrediente, Integer> ingredientes; // Cambiado a Map
    private String preparacion;

    public Receta(String nombre, int tiempoCoccion, Map<Ingrediente, Integer> ingredientes, String preparacion) {
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
        for (Map.Entry<Ingrediente, Integer> entry : ingredientes.entrySet()) {
            ListIngredientes += "\n" + entry.getKey() + ": " + entry.getValue();
        }
        return "Receta: \nTiempo de coccion: " + tiempoCoccion + "\nIngredientes: " + ListIngredientes + "\nPreparacion: " + preparacion;
    }

    public Map<Ingrediente, Integer> getIngredientes() {
        return ingredientes;
    }
}