package factoryMethod.pizzas;

public class PizzaCalabresa implements Pizza {
    private String ingredientes;
    private int tempo;
    private int fatias;
    private String tamCaixa;

    public PizzaCalabresa() {
        ingredientes = "calabresa";
        tempo = 15;
        fatias = 8;
        tamCaixa = "Media";
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