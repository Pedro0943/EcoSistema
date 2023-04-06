package ecosistema;
public class Tilapia extends Peixe {
    public void comerIsca(){
        System.out.println("Comendo isca");
        
    }
    


    @Override
    public void alimentar() {
        System.out.println("Comendo raçao");
    }
    
    public void consequencia(String isca){
        if(isca == "Engoliu a isca"){
            System.out.println("Fisgado");
        }else{
            System.out.println("Levou a isca");
        }
    }  
    
}