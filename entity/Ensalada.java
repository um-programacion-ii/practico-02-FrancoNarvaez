package entity;

import java.util.ArrayList;
import java.util.List;
import service.Cocinable;

public class Ensalada extends Receta implements Cocinable{
    public Ensalada(){
        super("Ensalada",0, inicializarIngredientes(), inicializarUtensilios(), "Cortar los ingredientes y mezclarlos");
    }

    private static List<Ingrediente> inicializarIngredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Lechuga", 1));
        ingredientes.add(new Ingrediente("Tomate", 2));
        ingredientes.add(new Ingrediente("Cebolla", 1));
        return ingredientes;
    }

    private static List<Utensilio> inicializarUtensilios() {
        List<Utensilio> utensilios = new ArrayList<>();
        utensilios.add(new Utensilio("Cuchillo", 1, 10));
        utensilios.add(new Utensilio("Tabla", 1, 20));
        return utensilios;
    }

    @Override
    public void cocinar() {
        // Aquí puedes definir lo que sucede cuando se cocina la Ensalada
        System.out.println("Cortando lechuga...");
        System.out.println("Cortando tomate...");
        System.out.println("Cortando cebolla...");
        System.out.println("Mezclando ingredientes...");
    }
}