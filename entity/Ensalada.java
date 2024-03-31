package entity;

public class Ensalada extends Receta{
    public Ensalada(){
        super("Ensalada",0, new Ingrediente[]{new Ingrediente("Lechuga", 1), new Ingrediente("Tomate", 1), new Ingrediente("Cebolla", 1)}, "Cortar los ingredientes y mezclarlos");
    }
}
