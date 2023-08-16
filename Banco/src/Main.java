

public class Main {

    public static void main(String[] args) {
            
        Cliente renan = new Cliente();
        renan.setNome("Renan Garcia");


    Conta cc        = new ContaCorrente(renan);
    Conta poupanca  = new ContaPoupanca(renan);
    

    //Testando o metodo de deposito
    cc.depositar(100);
    poupanca.depositar(200);


    //Testando o metodo de imprimirExtrato
    poupanca.imprimirExtrato();
    cc.imprimirExtrato();



    //Testando o metodo de tranferir
    cc.transferir(1000, poupanca);
    cc.imprimirExtrato();
    poupanca.imprimirExtrato();
    }


}
