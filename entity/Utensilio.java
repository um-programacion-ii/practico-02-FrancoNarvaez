package entity;

import service.Despensable;
import service.Reutilizable;

public class Utensilio implements Despensable, Reutilizable {
    private String nombre;
    private int cantidad;
    private int vidaUtil;

    public Utensilio(String nombre, int cantidad, int vidaUtil) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.vidaUtil = vidaUtil;
    }
    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }
    @Override
    public void usar() {
        if (vidaUtil > 0) {
            vidaUtil--;
        }
    }

    @Override
    public int getVidaUtil() {
        return vidaUtil;
    }

    @Override
    public void setCantidad(int nuevaCantidad) {
        this.cantidad = nuevaCantidad;
    }

    public void renovarVidaUtil(int nuevaVidaUtil) {
        vidaUtil = nuevaVidaUtil;
    }
}
