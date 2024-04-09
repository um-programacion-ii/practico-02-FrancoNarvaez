package entity;

import java.util.List;
import java.util.ArrayList;

public class Cocina {
    private Chef chef;

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void cocinar(Receta receta, Despensa despensa) {
        List<Ingrediente> faltantes = new ArrayList<>();
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            if (!despensa.getIngredientes().contains(ingrediente)) {
                faltantes.add(ingrediente);
            }
        }

        if (faltantes.isEmpty()) {
            System.out.println(chef.getNombre() + " está cocinando la receta: " + receta.getNombre());
            for (Ingrediente ingrediente : receta.getIngredientes()) {
                despensa.quitarIngrediente(ingrediente);
            }
        } else {
            System.out.println(chef.getNombre() + " no puede cocinar la receta: " + receta.getNombre());
            System.out.println("Faltan los siguientes ingredientes en la despensa: " + faltantes);
        }
    }
}