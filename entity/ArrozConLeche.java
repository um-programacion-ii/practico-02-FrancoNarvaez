package entity;

import service.Cocinable;
import java.util.ArrayList;
import java.util.List;

public class ArrozConLeche extends Receta implements Cocinable {
    public ArrozConLeche() {
        super("Arroz Con Leche", 30, inicializarIngredientes(), inicializarUtensilios(),"Instrucciones de preparación...");
    }

    private static List<Ingrediente> inicializarIngredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Arroz", 125));
        ingredientes.add(new Ingrediente("Leche", 200));
        ingredientes.add(new Ingrediente("Azucar", 100));
        ingredientes.add(new Ingrediente("Canela", 25));
        return ingredientes;
    }

    private static List<Utensilio> inicializarUtensilios() {
        List<Utensilio> utensilios = new ArrayList<>();
        utensilios.add(new Utensilio("Olla", 1, 10));
        utensilios.add(new Utensilio("Cuchara", 1, 20));
        return utensilios;
    }

    @Override
    public void cocinar() {
        // Aquí puedes definir lo que sucede cuando se cocina el Arroz Con Leche
        System.out.println("Rompiendo huevos...");
        System.out.println("Batiendo huevos...");
        System.out.println("Añadiendo leche...");
        System.out.println("Añadiendo azucar...");
        System.out.println("Añadiendo arroz...");
        System.out.println("Añadiendo canela...");
        System.out.println("Cocinando Arroz Con Leche...");
    }
}