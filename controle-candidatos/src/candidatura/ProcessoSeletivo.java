package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
   
        
        //Teste caso1
        /*
        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
        */


        //Teste caso2
        //selecaoCandidatos();

        //Teste caso3
        //imprimirSelecionados();

        //Teste caso4
        String [] candidatos = {"RENAN", "DANIELA", "MARIZA", "MARCOS", "CAIO"};
        for (String candidato : candidatos) {
            ligar(candidato);
        }
        
    }

    //CASO 1
    //Listar decisões conforme a pretensão salarial
    static void analisarCandidato (double salarioPretendido){

        double salarioBase = 2000.00;

        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para candidato");
        } else if( salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");}
            else {
                System.out.println("Aguardar os demais candidatos");
            }
        }

    //CASO 2
    //Geração de Pretensão salarial aleatória e analise de aprovação ou rejeição dos candidados

        //Geração de valor randomico entre R$1800 a R$2200 para teste
        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800,2200);
        }
        
        //Logica de seleção com base na comparação entre salarioBase e valorPretendido
        static void selecaoCandidatos(){
        //Array de candidatos
        String [] candidatos = {"RENAN", "DANIELA", "MARIZA", "MARCOS", "CAIO", "ELENI", "KYRA", "NICK", "THOR", "MEL"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase= 2000;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
                String candidato = candidatos[candidatoAtual];
                double salarioPretendido = valorPretendido();

                System.out.println("O candidato "+ candidato + " solicitou o salário de R$ " + salarioPretendido);
                if (salarioBase >= salarioPretendido ){
                    System.out.println("O candido "+ candidato + " foi selecionado para a vaga.");
                    candidatosSelecionados++;
                }else{
                    System.out.println("O candidato " + candidato + " não foi selecionado para a vaga.");
                    }
                    candidatoAtual++;

        }

    }
        //CASO 3
        //Metodo abreviado foreach para imprimir os candidados selecionados

        static void imprimirSelecionados(){
            String [] candidatosSelecionados = {"RENAN", "DANIELA", "MARIZA", "MARCOS", "CAIO"};

            for (String candidato : candidatosSelecionados) {
                System.out.println("O candidato selecionado foi o "+ candidato);
            }
        }

        //CASO 4
        //Tentativas de ligaçãdo do RH ao candidato

        //Metodo para simular se o candidato atendeu ou não a ligação
        static boolean atender(){
            
            return new Random().nextBoolean();

        }
        static void ligar(String candidato){
            int tentativa = 1;

            do   {
                if (atender()){
                System.out.println("O candidato "+ candidato + " atendeu a ligação");
            }else{
                tentativa++;
                System.out.println("O candidato " + candidato + " não atendeu a ligação. Realizando a tentativa de ligação no: "+ tentativa);
            } 
            }while(atender()==false || tentativa < 3);

        }
 
}
