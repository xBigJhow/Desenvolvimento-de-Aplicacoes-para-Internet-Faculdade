package factoryMethod.fabricas;

public class FabricaFactory {
	
	public static Fabrica getFabrica(String local) {
		if(local.equals("Centro")) {
			return new FabricaCentro();
			
		} else if(local.equals("Oeste")) {
			return new FabricaOeste();
			
		} else {
			return null;
		}
	}

}
