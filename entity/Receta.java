package entity;

class Receta {
    private String nombre;
    private int tiempoCoccion;
    private Ingrediente[] ingredientes;
    private String preparacion;

    public Receta(String nombre, int tiempoCoccion, Ingrediente[] ingredientes, String preparacion) {
        this.nombre = nombre;
        this.tiempoCoccion = tiempoCoccion;
        this.ingredientes = ingredientes;
        this.preparacion = preparacion;
    }

    public String getPreparacion() {
        return preparacion;
    }
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        String ListIngredientes = "";
        for (Ingrediente ingrediente : ingredientes) {
            ListIngredientes += "\n" + ingrediente;
        }
        return "Receta: \nTiempo de coccion: " + tiempoCoccion + "\nIngredientes: " + ListIngredientes + "\nPreparacion: " + preparacion;
    }
    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }
}
