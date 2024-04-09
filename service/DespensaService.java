package service;

import entity.Despensa;
import entity.Ingrediente;
import entity.Utensilio;


public class DespensaService {

    public void verificarStock(Despensa despensa, Ingrediente ingrediente) throws StockInsuficiente {
        Despensable despensable = despensa.getDespensable(ingrediente.getNombre());
        if (despensable == null || despensable.getCantidad() < ingrediente.getCantidad()) {
            throw new StockInsuficiente("No hay suficiente " + ingrediente.getNombre() + " en la despensa para la receta.");
        }
    }

    public void verificarVidaUtil(Despensa despensa, Utensilio utensilio) throws VidaUtilInsuficiente {
        Despensable despensable = despensa.getDespensable(utensilio.getNombre());
        if (despensable instanceof Utensilio) {
            Utensilio utensilioEnDespensa = (Utensilio) despensable;
            if (utensilioEnDespensa.getVidaUtil() <= 0) {
                throw new VidaUtilInsuficiente("El utensilio " + utensilio.getNombre() + " no tiene suficiente vida útil para cocinar.");
            }
        } else {
            throw new VidaUtilInsuficiente("El utensilio " + utensilio.getNombre() + " no se encuentra en la despensa.");
        }
    }

    public void renovarUtensilios(Despensa despensa) {
        despensa.getDespensablesMap().values().stream()
                .filter(despensable -> despensable instanceof Utensilio)
                .map(despensable -> (Utensilio) despensable)
                .filter(utensilio -> utensilio.getVidaUtil() <= 0)
                .forEach(utensilio -> utensilio.renovarVidaUtil(10));
    }
}