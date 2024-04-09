package entity;

import service.DespensaService;
import service.StockInsuficiente;
import service.VidaUtilInsuficiente;


public class Cocina {
    private Chef chef;
    private DespensaService despensaService;

    public Cocina(DespensaService despensaService) {
        this.despensaService = despensaService;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void cocinar(Receta receta, Despensa despensa) throws VidaUtilInsuficiente, StockInsuficiente {
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            despensaService.verificarStock(despensa, ingrediente);
        }

        for (Utensilio utensilio : receta.getUtensilios()) {
            despensaService.verificarVidaUtil(despensa, utensilio);
        }

        System.out.println(chef.getNombre() + " está cocinando la receta: " + receta.getNombre());
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            despensa.quitarDespensable(ingrediente.getNombre(), ingrediente.getCantidad());
        }
        for (Utensilio utensilio : receta.getUtensilios()) {
            ((Utensilio) despensa.getDespensable(utensilio.getNombre())).usar();
        }
    }
}