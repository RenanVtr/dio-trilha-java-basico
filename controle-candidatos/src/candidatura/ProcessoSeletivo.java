package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
    }

    static void selecaoCandidatos(){

        //Array de candidatos
        String [] candidatos = {"RENAN", "DANIELA", "MARIZA", "MARCOS", "CAIO", "ELENI", "KYRA", "NICK", "THOR", "MEL"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;

        while (candidatosSelecionados < 5){

            
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
