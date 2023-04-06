package ecosistema;
public class Mamifero extends Animal {
    private String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
        
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
        
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
        
     
}