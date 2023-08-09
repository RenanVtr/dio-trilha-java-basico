package Telefone;

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
