package factoryMethod.fabricas;

import factoryMethod.pizzas.Pizza;
import factoryMethod.pizzas.PizzaFactory;

public class FabricaOeste implements Fabrica {
    public void fazerPizza(String sabor) {
        Pizza pizza = PizzaFactory.getPizza(sabor);
        if (pizza != null) {
            System.out.println("Pizza na Fábrica do Oeste:");
            pizza.preparar();
            pizza.assar();
            pizza.cortar();
            pizza.embalar();
        } else {
            System.out.println("Sabor de pizza não disponível.");
        }
    }
}