package entity;

public class Main {
    public static void main(String[] args){
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

        Despensa despensa = new Despensa();

        despensa.addIngrediente(azucar);
        despensa.addIngrediente(pan);
        despensa.addIngrediente(leche);
        despensa.addIngrediente(arroz);
        despensa.addIngrediente(lechuga);
        despensa.addIngrediente(tomate);
        despensa.addIngrediente(huevo);
        despensa.addIngrediente(aceite);
        despensa.addIngrediente(vinagre);
        despensa.addIngrediente(sal);
        despensa.addIngrediente(cebolla);


        despensa.getIngrediente("Azucar", 2);
        despensa.getIngrediente("Pan", 1);

        System.out.println("\nLa Despensa antes de cocinar es: " + despensa.getIngredientes());

        HuevoDuro huevoDuro = new HuevoDuro();
        System.out.println("\n" + huevoDuro);

        ArrozConLeche arrozConLeche = new ArrozConLeche();
        System.out.println("\n" + arrozConLeche);

        Ensalada ensalada = new Ensalada();
        System.out.println("\n" + ensalada);

        Chef chef = new Chef("Gordon Ramsay", 3);
        Cocina cocinaService = new Cocina();
        cocinaService.cocinar(huevoDuro, despensa, chef);
        cocinaService.cocinar(arrozConLeche, despensa, chef);
        cocinaService.cocinar(ensalada, despensa, chef);
        cocinaService.cocinar(ensalada, despensa, chef);
    }
}