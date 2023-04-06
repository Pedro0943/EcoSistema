package ecosistema;
public class Lagarto extends Reptil {
    public void pegarSol(){
        System.out.println("Esquentando o sangue pegando sol");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo ovos");
    }

    @Override
    public void emitirSom() {
        System.out.println("SHIISHI");
    }
    
      public void reagir(String tocar){
          if(tocar == "Na boca"){
              System.out.println("Morder");
          }else{
              System.out.println("Nao morde");
          }
      } 
  
}