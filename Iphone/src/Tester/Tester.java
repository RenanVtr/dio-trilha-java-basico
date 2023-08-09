package Tester;

import Navegador.Opera;
import Player.Ipod;
import Telefone.Smartphone;
import Iphone.Iphone;


public class Tester {
    
    public static void main(String[] args) {
        
        Opera opera = new Opera();
        Ipod ipod = new Ipod();
        Smartphone smartphone = new Smartphone();
        Iphone iphone = new Iphone();

        //Testando o objeto Opera
        opera.adicionarNovaAba();
        opera.atualizar();
        opera.exibirPagina();

        //Testando o objeto Ipod
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        //Testando o objeto Smartphone
        smartphone.atender();
        smartphone.ligar();
        smartphone.iniciarCorreioVoz();

        //Testando o objeto Iphone
        iphone.adicionarNovaAba();
        iphone.atualizar();
        iphone.exibirPagina();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.ligar();



    }
}
