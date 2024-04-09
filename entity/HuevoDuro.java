package entity;

import java.util.ArrayList;
import java.util.List;
import service.Cocinable;

public class HuevoDuro extends Receta implements Cocinable{
    public HuevoDuro() {
        super("Huevo Duro", 10, inicializarIngredientes(), inicializarUtensilios(), "Instrucciones de preparación...");
    }

    private static List<Ingrediente> inicializarIngredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Huevo", 1));
        return ingredientes;
    }

    private static List<Utensilio> inicializarUtensilios() {
        List<Utensilio> utensilios = new ArrayList<>();
        utensilios.add(new Utensilio("Olla", 1, 10));
        utensilios.add(new Utensilio("Cucharon", 1, 10));
        return utensilios;
    }

    @Override
    public void cocinar() {
        // Aquí puedes definir lo que sucede cuando se cocina el Huevo Duro
        System.out.println("Poniendo a hervir agua...");
        System.out.println("Añadiendo huevo...");
        System.out.println("Cocinando huevo...");
    }
}