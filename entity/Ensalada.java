package entity;

import java.util.ArrayList;
import java.util.List;

public class Ensalada extends Receta{
    public Ensalada(){
        super("Ensalada",0, inicializarIngredientes(), "Cortar los ingredientes y mezclarlos");
    }

    private static List<Ingrediente> inicializarIngredientes() {
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes.add(new Ingrediente("Lechuga", 1));
        ingredientes.add(new Ingrediente("Tomate", 2));
        ingredientes.add(new Ingrediente("Cebolla", 1));
        return ingredientes;
    }
}