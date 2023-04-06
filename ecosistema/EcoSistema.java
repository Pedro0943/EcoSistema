package ecosistema;
public class EcoSistema {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();
        Cobra cobra = new Cobra();
        Lagarto lagarto = new Lagarto();
        Pirarucu pirarucu = new Pirarucu();
        Tilapia tilapia = new Tilapia();
        Garnize garnize = new Garnize();
        Piguim piguim = new Piguim();
        
        
        mamifero.setPeso(99.5f);
        mamifero.setIdade(2);
        mamifero.setMembros(4);
        mamifero.apresentar();
        mamifero.alimentar();
        mamifero.locomover();
        mamifero.emitirSom();
        gato.reagir("Carinhar");
        vaca.leite("Leite nao foi tirado");
        System.out.println("===========================");
        
        reptil.setPeso(10.5f);
        reptil.setIdade(1);
        reptil.setMembros(1);
        reptil.apresentar();
        reptil.alimentar();
        reptil.locomover();
        reptil.emitirSom();
        cobra.reagir("Se afasta-se");
        lagarto.reagir("Nao tocar");
        System.out.println("=========================");
        
        peixe.setPeso(150);
        peixe.setIdade(8);
        peixe.setMembros(1);
        peixe.apresentar();
        peixe.alimentar();
        peixe.locomover();
        peixe.emitirSom();
        peixe.soltarBolha();
        pirarucu.consequencia("Enguliu a isca");
        tilapia.consequencia("Nao engoliu a isca");
        System.out.println("==========================");
        
        ave.setPeso(1);
        ave.setIdade(4);
        ave.setMembros(9);
        ave.apresentar();
        ave.alimentar();
        ave.locomover();
        ave.emitirSom();
        ave.fazerNinho();
        garnize.Alimentaçao("Racao");
        piguim.caçar("Sem peixe");
        
       
    }
    
}
