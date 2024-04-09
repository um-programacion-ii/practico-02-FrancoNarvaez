package entity;

import service.DespensaService;
import service.Despensable;
import service.StockInsuficiente;
import service.VidaUtilInsuficiente;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Despensa despensa = new Despensa();
        Chef chef = new Chef("Gordon Ramsay", 3);
        DespensaService despensaService = new DespensaService();
        Cocina cocinaService = new Cocina(despensaService);
        cocinaService.setChef(chef);

        // Add ingredients to the pantry
        Map<String, Integer> ingredientes = new HashMap<>();
        ingredientes.put("Azucar", 5);
        ingredientes.put("Pan", 10);
        ingredientes.put("Leche", 2);
        ingredientes.put("Arroz", 1);
        ingredientes.put("Lechuga", 3);
        ingredientes.put("Tomate", 4);
        ingredientes.put("Huevo", 12);
        ingredientes.put("Aceite", 1);
        ingredientes.put("Vinagre", 1);
        ingredientes.put("Sal", 1);
        ingredientes.put("Cebolla", 2);
        ingredientes.put("Canela", 1);

        for (Map.Entry<String, Integer> item : ingredientes.entrySet()) {
            despensa.agregarDespensable(new Ingrediente(item.getKey(), item.getValue()));
        }

        // Add utensils to the pantry
        Map<String, Integer> utensilios = new HashMap<>();
        utensilios.put("Olla", 60);
        utensilios.put("Cuchara", 75);
        utensilios.put("Cuchillo", 68);
        utensilios.put("Cucharon", 15);
        utensilios.put("Tabla", 25);

        for (Map.Entry<String, Integer> item : utensilios.entrySet()) {
            despensa.agregarDespensable(new Utensilio(item.getKey(), 1, item.getValue()));
        }

        // Create and cook recipes
        Receta[] recetas = {new HuevoDuro(), new ArrozConLeche(), new Ensalada()};
        for (Receta receta : recetas) {
            try {
                for (Despensable despensable : receta.getUtensilios()) {
                    if (despensable instanceof Utensilio) {
                        despensaService.verificarVidaUtil(despensa, (Utensilio) despensable);
                    }
                }
                cocinaService.cocinar(receta, despensa);
            } catch (VidaUtilInsuficiente | StockInsuficiente e) {
                System.out.println(e.getMessage());
            }
        }

        // Get utensils with a useful life of 5 or less
        List<Utensilio> utensiliosConPocaVidaUtil = despensa.getUtensiliosConVidaUtilMenorOIgual(30);
        System.out.println("Utensilios con vida útil de 5 o menos: " + utensiliosConPocaVidaUtil);

        // Renew utensils
        despensaService.renovarUtensilios(despensa);
        System.out.println("Despensa después de renovar utensilios:\n" + despensa.getDespensables());
    }
}