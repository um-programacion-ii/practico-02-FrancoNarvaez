package entity;

import service.Cocinable;
import java.util.List;

public abstract class Receta implements Cocinable {
    private String nombre;
    private int tiempoCoccion;
    private List<Ingrediente> ingredientes;
    private List<Utensilio> utensilios; // Nueva lista de utensilios
    private String preparacion;

    public Receta(String nombre, int tiempoCoccion, List<Ingrediente> ingredientes, List<Utensilio> utensilios, String preparacion) {
        this.nombre = nombre;
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.utensilios = utensilios; // Inicializar la lista de utensilios
        this.preparacion = preparacion;
    }

    @Override
    public abstract void cocinar();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public List<Utensilio> getUtensilios() {
        return utensilios;
    }

    @Override
    public String toString() {
        String ListIngredientes = "";
        for (Ingrediente ingrediente : ingredientes) {
            ListIngredientes += "\n" + ingrediente;
        }
        return "Receta: \nTiempo de coccion: " + tiempoCoccion + "\nIngredientes: " + ListIngredientes + "\nPreparacion: " + preparacion;
    }
}