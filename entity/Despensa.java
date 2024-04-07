package entity;

import java.util.HashMap;
import java.util.Map;


public class Despensa {
    private Map<Ingrediente, Integer> ingredientes;

    public Despensa() {
        this.ingredientes = new HashMap<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente, int cantidad) {
        this.ingredientes.put(ingrediente, cantidad);
    }

    public void quitarIngredientes(Ingrediente ingrediente, int cantidad) {
        int cantidadActual = this.ingredientes.get(ingrediente);
        if (cantidadActual < cantidad) {
            System.out.println("No hay suficientes " + ingrediente.getNombre());
        } else {
            this.ingredientes.put(ingrediente, cantidadActual - cantidad);
        }
    }

    public boolean tieneIngredientes(Map<Ingrediente, Integer> ingredientesReceta) {
        for (Map.Entry<Ingrediente, Integer> entry : ingredientesReceta.entrySet()) {
            Ingrediente ingrediente = entry.getKey();
            int cantidadNecesaria = entry.getValue();
            if (!this.ingredientes.containsKey(ingrediente) || this.ingredientes.get(ingrediente) < cantidadNecesaria) {
                return false;
            }
        }
        return true;
    }
}

