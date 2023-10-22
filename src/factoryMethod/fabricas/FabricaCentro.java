package factoryMethod.fabricas;

import factoryMethod.pizzas.Pizza;
import factoryMethod.pizzas.PizzaFactory;

public class FabricaCentro implements Fabrica {
    public void fazerPizza(String sabor) {
        Pizza pizza = PizzaFactory.getPizza(sabor);
        if (pizza != null) {
            System.out.println("Pizza na Fábrica do Centro:");
            pizza.preparar();
            pizza.assar();
            pizza.cortar();
            pizza.embalar();
        } else {
            System.out.println("Sabor de pizza não disponível.");
        }
    }
}