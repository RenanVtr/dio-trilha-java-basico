package Telefone;


//Objeto implementa a interface Telefone, com finalidade de simular operacoes de um aparelho telefonico como: 
// - Ligar
// - Atender
// - Iniciar Correio de Voz
//

public class Smartphone implements Telefone{

    @Override
    public void ligar() {
        System.out.println("Ligando através de Smartphone.");
        
    }

    @Override
    public void atender() {
       System.out.println("atendendo através de Smartphone.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz através de Smartphone.");
    }
    
}
