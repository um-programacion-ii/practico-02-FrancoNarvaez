package entity;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){

        // Se crean nuevos ingredientes
        Ingrediente azucar = new Ingrediente("Azucar", 5);
        Ingrediente pan = new Ingrediente("Pan", 3);
        Ingrediente leche = new Ingrediente("Leche", 10);
        Ingrediente arroz = new Ingrediente("Arroz", 500);
        Ingrediente lechuga = new Ingrediente("Lechuga", 1);
        Ingrediente tomate = new Ingrediente("Tomate", 1);
        Ingrediente huevo = new Ingrediente("Huevo", 12);
        Ingrediente aceite = new Ingrediente("Aceite", 5);
        Ingrediente vinagre = new Ingrediente("Vinagre", 5);
        Ingrediente sal = new Ingrediente("Sal", 500);
        Ingrediente cebolla = new Ingrediente("Cebolla", 3);

        // Se crea la despensa
        Despensa despensa = new Despensa();

        // Se agregan ingredientes a la despensa, algunos deberia fallar
        despensa.agregarIngrediente(azucar,5);
        despensa.agregarIngrediente(pan, 5);
        despensa.agregarIngrediente(leche, 5);
        despensa.agregarIngrediente(arroz, 5);
        despensa.agregarIngrediente(lechuga, 5);
        despensa.agregarIngrediente(tomate, 5);
        despensa.agregarIngrediente(huevo, 5);
        despensa.agregarIngrediente(aceite, 5);
        despensa.agregarIngrediente(vinagre, 5);
        despensa.agregarIngrediente(sal, 5);
        despensa.agregarIngrediente(cebolla, 5);

        // Se quitan de la despensa ingredientes
        despensa.quitarIngredientes(azucar, 2);

        Map<Ingrediente, Integer> ingredienteParaVerificar = new HashMap<>();
        ingredienteParaVerificar.put(pan, 1);

        if (despensa.tieneIngredientes(ingredienteParaVerificar)) {
            System.out.println("\nTiene 1 pan");
        } else
            System.out.println("\nNo tiene 1 pan");

        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println("\n" + huevoDuro);

        ArrozConLeche arrozConLeche = new ArrozConLeche();
        System.out.println("\n" + arrozConLeche);

        Ensalada ensalada = new Ensalada();
        System.out.println("\n" + ensalada);

        Chef chef = new Chef("Gordon Ramsay", 3);
        Cocina cocinaService = new Cocina();
        cocinaService.cocinar(huevoDuro, despensa);
        cocinaService.cocinar(arrozConLeche, despensa);
        cocinaService.cocinar(ensalada, despensa);
        cocinaService.cocinar(ensalada, despensa);
    }
}