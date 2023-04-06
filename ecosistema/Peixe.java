package ecosistema;
public class Peixe extends Animal {
    private String corEscama;

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }
        
    @Override
    public void alimentar() {
        System.out.println("Comendo substancias na agua");
    }
       
    @Override
    public void locomover() {
        System.out.println("Nadando");
    }
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas");
    }
        
    
    
}