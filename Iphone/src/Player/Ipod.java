package Player;

public class Ipod implements Player{

    @Override
    public void tocar() {
        System.out.println("Tocando através do Ipod.");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando através do Ipod.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando musica através do Ipod.");
    }
    
}
