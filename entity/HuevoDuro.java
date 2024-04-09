package entity;

import java.util.ArrayList;
import java.util.List;

public class HuevoDuro extends Receta{
    public HuevoDuro() {
        super("Huevo Duro", 10, inicializarIngredientes(), "Instrucciones de preparación...");
    }

    private static List<Ingrediente> inicializarIngredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Huevo", 1));
        return ingredientes;
    }
}