import java.util.Scanner;

public class Contador {
        /*O sistema devera receber dois parametros via terminal representando dois numeros inteiros,
         * e imprimir o numero de iteracoes entre os dois valores, contando do valor mais baixo para o mais alto
         * Caso o segundo parametro for maior que o primeiro, o sistema devera lancar uma exception
         */

    public static void main(String[] args) {
        
         Scanner terminal = new Scanner(System.in);

            //Captura de dados
            System.out.println("Digite o primeiro parametro: ");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parametro: ");
            int parametroDois = terminal.nextInt();
            
            
            //Chamando metodo contador
            contar(parametroUm, parametroDois);
               

    }
    

    //Metodo contador
    static void contar( int parametroUm, int parametroDois){
            
        //Calculando a diferença entre os valores
        int  contagem = parametroDois - parametroUm;

        //Imprimindo as iteracoes conforme regra de negocio
        for (int iteracao = 1; iteracao <= contagem ; iteracao++ ){
            System.out.println("Impriminido o numero "+ iteracao);
        }
    }

}
