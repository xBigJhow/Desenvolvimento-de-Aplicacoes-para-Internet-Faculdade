package factoryMethod.pizzas;


public class PizzaFactory {
	public static Pizza getPizza(String sabor) {
		if (sabor.equals("Queijo")) {
			return new PizzaQueijo();
		} else if(sabor.equals("Frango")){
			return new PizzaFrango();
		} else if(sabor.equals("Calabresa")) {
			return new PizzaCalabresa();
		}
		return null;
	}
}
