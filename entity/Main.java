package entity;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        // Se crean nuevos ingredientes
        System.out.println("Creando ingredientes...");
        Ingrediente azucar = new Ingrediente("Azucar", 1000);
        Ingrediente pan = new Ingrediente("Pan", 3);
        Ingrediente leche = new Ingrediente("Leche", 1000);
        Ingrediente arroz = new Ingrediente("Arroz", 500);
        Ingrediente lechuga = new Ingrediente("Lechuga", 1);
        Ingrediente tomate = new Ingrediente("Tomate", 1);
        Ingrediente huevo = new Ingrediente("Huevo", 12);
        Ingrediente aceite = new Ingrediente("Aceite", 5);
        Ingrediente vinagre = new Ingrediente("Vinagre", 5);
        Ingrediente sal = new Ingrediente("Sal", 500);
        Ingrediente cebolla = new Ingrediente("Cebolla", 3);
        Ingrediente canela = new Ingrediente("Canela", 250);

        // Se crea la despensa
        System.out.println("Creando despensa...");
        Despensa despensa = new Despensa();

        // Se agregan ingredientes a la despensa, algunos deberia fallar
        System.out.println("Agregando ingredientes a la despensa...\n");
        despensa.agregarIngrediente(azucar);
        despensa.agregarIngrediente(pan);
        despensa.agregarIngrediente(leche);
        despensa.agregarIngrediente(arroz);
        despensa.agregarIngrediente(lechuga);
        despensa.agregarIngrediente(tomate);
        despensa.agregarIngrediente(huevo);
        despensa.agregarIngrediente(aceite);
        despensa.agregarIngrediente(vinagre);
        despensa.agregarIngrediente(sal);
        despensa.agregarIngrediente(cebolla);
        despensa.agregarIngrediente(canela);

        // Se quitan de la despensa ingredientes
        System.out.println("Quitando ingredientes de la despensa...");
        despensa.quitarIngrediente(sal);

        // Se verifica si la despensa tiene ingredientes
        System.out.println("Verificando si la despensa tiene ingredientes...\n");
        List<Ingrediente> ingredienteParaVerificar = new ArrayList<>();
        ingredienteParaVerificar.add(pan);

        if (despensa.tieneIngredientes(ingredienteParaVerificar)) {
            System.out.println("Verificado: Tiene 1 pan");
        } else
            System.out.println("No tiene 1 pan");

        // Se crean recetas
        System.out.println("\nCreando recetas...\n");
        System.out.println("Receta de Huevo Duro");
        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println(huevoDuro);

        System.out.println("\nReceta de Arroz Con Leche");
        ArrozConLeche arrozConLeche = new ArrozConLeche();
        System.out.println(arrozConLeche);

        System.out.println("\nReceta de Ensalada");
        Ensalada ensalada = new Ensalada();
        System.out.println(ensalada);

        // Se cocinan las recetas
        System.out.println("\nCocinando recetas...\n");
        Chef chef = new Chef("Gordon Ramsay", 3);
        Cocina cocinaService = new Cocina();
        cocinaService.setChef(chef);

        System.out.println("Despensa actualmente: " + despensa.getIngredientes());

        System.out.println("Cocinando Huevo Duro...");
        cocinaService.cocinar(huevoDuro, despensa);
        System.out.println("Cocinando Arroz Con Leche...");
        cocinaService.cocinar(arrozConLeche, despensa);
        System.out.println("Cocinando Ensalada...");
        cocinaService.cocinar(ensalada, despensa);
    }
}