package entity;

public class ArrozConLeche extends Receta {
    public ArrozConLeche() {
        super("Arroz con Leche", 40, new Ingrediente[]{new Ingrediente("Arroz", 1), new Ingrediente("Leche", 1), new Ingrediente("Azucar", 1)}, "Cocinar el arroz en la leche con azúcar durante 40 minutos.");
    }
}