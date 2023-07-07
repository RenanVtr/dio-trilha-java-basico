package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        //analisarCandidato(1900);
        //analisarCandidato(2200);
        //analisarCandidato(2000);
        selecaoCandidatos();
    }

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

        static double valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800,2200);
        }
        
    }
