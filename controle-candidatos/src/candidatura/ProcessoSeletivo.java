package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        analisarCandidato(1900);
        analisarCandidato(2200);
        analisarCandidato(2000);
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
        
    }
