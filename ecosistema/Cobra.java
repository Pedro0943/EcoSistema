package ecosistema;
public class Cobra extends Reptil {
    public void ingetarVeneno(){
        System.out.println("Igetando veneno");
    }

    @Override
    public void emitirSom() {
        System.out.println("Sssss");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer roedores");
    }
        
    
    public void reagir(String frase){
        if(frase == "Se afastar- se"){
            System.out.println("Ir embora");
        }else{
            System.out.println("Da bote");
        }
    }
            
    
}