package entity;

import java.util.ArrayList;
import java.util.List;

public class ArrozConLeche extends Receta {
    public ArrozConLeche() {
        super("Arroz Con Leche", 30, inicializarIngredientes(), "Instrucciones de preparación...");
    }

    private static List<Ingrediente> inicializarIngredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Arroz", 125));
        ingredientes.add(new Ingrediente("Leche", 200));
        ingredientes.add(new Ingrediente("Azucar", 100));
        ingredientes.add(new Ingrediente("Canela", 25));
        return ingredientes;
    }
}