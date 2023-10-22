package factoryMethod.principal;

import java.util.Scanner;
import factoryMethod.fabricas.Fabrica;
import factoryMethod.fabricas.FabricaFactory;
import factoryMethod.pizzas.Pizza;
import factoryMethod.pizzas.PizzaFactory;



public class Main {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha a fábrica (Centro ou Oeste): ");
        String regiao = scanner.nextLine();

        System.out.println("Digite o sabor da pizza (Frango/Queijo/Calabresa):");
        String sabor = scanner.nextLine();

        scanner.close();

        
        Fabrica fabrica = FabricaFactory.getFabrica(regiao);
        Pizza pizza = PizzaFactory.getPizza(sabor);

        if (fabrica != null && pizza != null) {
            fabrica.fazerPizza(sabor);
        } else {
            System.out.println("Região da fábrica ou sabor de pizza não reconhecidos.");
        }
	}

}




