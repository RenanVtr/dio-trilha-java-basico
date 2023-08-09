package Navegador;


//Objeto implementa a interface Navegador, com finalidade de simular operacoes de um navegador como: 
// - Exibir pagina
// - Adicionar Nova Aba
// - Atualizar pagina
//

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
