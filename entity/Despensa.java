package entity;

import java.util.ArrayList;
import java.util.List;

public class Despensa {
    private List<Ingrediente> ingredientes;

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public List<Ingrediente> getIngredientes() {
        return new ArrayList<>(this.ingredientes);
    }

    public void agregarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public void quitarIngrediente(Ingrediente ingrediente) {
        this.ingredientes.remove(ingrediente);
    }

    public boolean tieneIngredientes(List<Ingrediente> ingredientesReceta) {
        return this.ingredientes.containsAll(ingredientesReceta);
    }
}