package factoryMethod.pizzas;

public class PizzaQueijo implements Pizza {
    private String ingredientes;
    private int tempo;
    private int fatias;
    private String tamCaixa;

    public PizzaQueijo() {
        ingredientes = "queijo";
        tempo = 20;
        fatias = 4;
        tamCaixa = "Pequena";
    }
    
    public void preparar() {
    	System.out.println("Preparando a pizza! Adicionando " + ingredientes);
    }
    
    public void assar() {
    	System.out.println("Tempo de espera - " + tempo + " minutos");
    }
    
    public void cortar() {
    	System.out.println("Cortar a pizza em " + fatias + " fatias");
    }
   
    public void embalar() {
    	System.out.println("Tamanho da caixa: " + tamCaixa);
    }
    
    
}