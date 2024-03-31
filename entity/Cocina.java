package entity;

public class Cocina {
    public void cocinar(Receta receta, Despensa despensa, Chef chef) {
        System.out.println("El chef " + chef.getNombre() + " está preparando plato: " + receta.getNombre());
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            String resultado = despensa.chekIngrediente(ingrediente.getNombre(), ingrediente.getCantidad());
            if (!resultado.equals("OK")) {
                System.out.println(resultado);
                System.out.println("La preparación ha sido cancelada ya que la despensa tiene esto:\n" + despensa.getIngredientes());
                return;
            }
        }
        for (Ingrediente ingrediente : receta.getIngredientes()) {
            despensa.restarIngrediente(ingrediente.getNombre(), ingrediente.getCantidad());
        }
        System.out.println("La preparación ha finalizado. Los ingredientes restantes en la despensa son:");{
            System.out.println(despensa.getIngredientes());
        }
    }
}