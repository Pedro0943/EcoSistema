package ecosistema;
public class Pirarucu extends Peixe{
    public void caçar(){
        System.out.println("Caçando");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando rápido");
    }

    @Override
    public void alimentar() {
        System.out.println("Peixes menores");
    }
    
    public void consequencia(String isca){
        if(isca == "Engoliu a isca"){
            System.out.println("Fisgado");
        }else{
            System.out.println("Levou a isca");
        }
    }
        
}