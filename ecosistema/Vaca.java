package ecosistema;
public class Vaca extends Mamifero {

    @Override
    public void alimentar() {
        System.out.println("Comendo capim");
    }
       

    @Override
    public void emitirSom() {
        System.out.println("MUUUUUU");
    }
     
    public void leite(String leite){
        if(leite == "Nao foi tirado"){
            System.out.println("Tirar o leite da vaca");
        }else{
            System.out.println("Nao precisa tirar leite");
        }
    }
    
}