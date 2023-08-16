public class Banco {
    
    public static void main(String[] args) {
        
        Conta cc        = new ContaCorrente();
        Conta poupanca  = new ContaPoupanca();
        


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
