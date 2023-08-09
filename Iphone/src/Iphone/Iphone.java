package Iphone;
import Navegador.Navegador;
import Player.Player;
import Telefone.Telefone;

public class Iphone implements Navegador, Telefone, Player{

    @Override
    public void tocar() {
        System.out.println("Tocando musica através do Iphone!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica através do Iphone!");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica através do Iphone!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando através do Iphone!");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo através do Iphone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz através do Iphone!");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina através do Iphone!");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba através do Iphone!");
    }

    @Override
    public void atualizar() {
        System.out.println("Atualizando pagina através do Iphone!");
    }
    
    
}
