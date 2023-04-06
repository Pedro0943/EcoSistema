package ecosistema;
public class Gato extends Mamifero {
    public void caçar(){
        System.out.println("Caçando");
    }


    @Override
    public void alimentar() {
        System.out.println("Raçao");
    }
       

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
    
    public void reagir(String tocar){
        if(tocar == "Carinhar"){
            System.out.println("Rorronar");
        }else{
            System.out.println("Estranhar");
        }
    }
        

}