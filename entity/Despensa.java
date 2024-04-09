package entity;

import service.Despensable;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.List;

public class Despensa {
    private Map<String, Despensable> despensables;

    public Despensa() {
        this.despensables = new HashMap<>();
    }

    public void nuevoDespensable(Despensable despensable) {
        this.despensables.put(despensable.getNombre(), despensable);
    }

    public void agregarDespensable(Despensable despensable) {
        Despensable existente = this.despensables.get(despensable.getNombre());
        if (existente != null) {
            existente.setCantidad(existente.getCantidad() + despensable.getCantidad());
        } else {
            this.nuevoDespensable(despensable);
        }
    }

    public void quitarDespensable(String nombre, int cantidad) {
        Despensable existente = this.despensables.get(nombre);
        if (existente != null) {
            int nuevaCantidad = existente.getCantidad() - cantidad;
            if (nuevaCantidad <= 0) {
                this.despensables.remove(nombre);
            } else {
                existente.setCantidad(nuevaCantidad);
            }
        }
    }

    public Despensable getDespensable(String nombre) {
        return this.despensables.get(nombre);
    }

    public String getDespensables() {
        return this.despensables.values().stream()
                .map(Despensable::toString)
                .collect(Collectors.joining("\n, "));
    }

    public Map<String, Despensable> getDespensablesMap() {
        return this.despensables;
    }

    public List<Utensilio> getUtensiliosConVidaUtilMenorOIgual(int vidaUtil) {
        return this.despensables.values().stream()
                .filter(despensable -> despensable instanceof Utensilio)
                .map(despensable -> (Utensilio) despensable)
                .filter(utensilio -> utensilio.getVidaUtil() <= vidaUtil)
                .collect(Collectors.toList());
    }
}