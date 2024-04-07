package entity;

import service.Cocinable;
import java.util.Map;


public class Cocina {
    public void cocinar(Receta receta, Despensa despensa) {
        if (despensa.tieneIngredientes(receta.getIngredientes())) {
            System.out.println("Cocinando la receta: " + receta.getNombre());
            for (Map.Entry<Ingrediente, Integer> entry : receta.getIngredientes().entrySet()) {
                despensa.quitarIngredientes(entry.getKey(), entry.getValue());
            }
        } else {
            System.out.println("No se puede cocinar la receta: " + receta.getNombre());
        }
    }
}