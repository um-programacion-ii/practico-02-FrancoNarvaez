package entity;

import java.util.ArrayList;
import java.util.List;

public class Despensa {
    private List<Ingrediente> ingredientes;

    public Despensa() {
        this.ingredientes = new ArrayList<>();
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public Ingrediente getIngrediente(String nombre, int cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                if (ingrediente.getCantidad() >= cantidad) {
                    ingrediente.sacar(cantidad);
                    return ingrediente;
                } else {
                    System.out.println("No hay suficiente cantidad de " + nombre);
                    return null;
                }
            }
        }
        System.out.println("No se encontró el ingrediente " + nombre);
        return null;
    }
    public String chekIngrediente(String nombre, int cantidad) {
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                if (ingrediente.getCantidad() >= cantidad) {
                    return "OK";
                }
                else {
                    return "No hay suficiente cantidad de " + nombre + "\nCantidad disponible: " + ingrediente.getCantidad() + "\nCantidad solicitada: " + cantidad;
                }
            }
        }
        return "No se encontró el ingrediente " + nombre;
    }
    public Ingrediente restarIngrediente(String nombre, int cantidad){
        for (Ingrediente ingrediente : ingredientes) {
            if (ingrediente.getNombre().equals(nombre)) {
                if (ingrediente.getCantidad() >= cantidad) {
                    ingrediente.sacar(cantidad);
                    return ingrediente;
                } else {
                    return null
                            ;
                }
            }
        }
        return null;
    }
}