package factoryMethod.pizzas;

public class PizzaFrango implements Pizza {
    private String ingredientes;
    private int tempo;
    private int fatias;
    private String tamCaixa;

    public PizzaFrango() {
        ingredientes = "frango";
        tempo = 25;
        fatias = 16;
        tamCaixa = "Grande";
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