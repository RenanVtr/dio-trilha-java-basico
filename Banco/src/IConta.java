public interface IConta {
    

    //Metodos 
    void sacar(double valor);
    
    void depositar(double valor);
    
    void transferir(double valor , Conta numeroContaDestino);

    void imprimirExtrato();
    
}
