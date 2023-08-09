package Navegador;

public class Opera implements Navegador{

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo pagina através do Opera.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando aba através do navegador Opera.");
    }

    @Override
    public void atualizar() {
       System.out.println("Atualizando pagina através do navegador Opera.");
    }
    
}
