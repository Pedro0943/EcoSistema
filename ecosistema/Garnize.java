package ecosistema;
public class Garnize extends Ave {
    public void ciscar() {
        System.out.println("ciscando");
    }

    @Override
    public void fazerNinho() {
        System.out.println("Ninho no chão");
    }
       

    @Override
    public void alimentar() {
        System.out.println("Alimentos da terra");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cócócó");
    }
      public void Alimentaçao(String comida){
          if(comida == "Ração"){
              System.out.println("Enchendo o papo");
          }else{
              System.out.println("Procurar comida");
          }
      }
     
    
}