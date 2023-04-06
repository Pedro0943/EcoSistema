package ecosistema;
public class Reptil extends Animal {
    private String corEscama;

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
           @Override
    public void alimentar() {
               System.out.println("Comendo vegetais");
    }
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    
}