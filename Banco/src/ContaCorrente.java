public class ContaCorrente extends Conta{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO CONTA CORRENTE ====");
        System.out.println(String.format("Olá %s !", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Conta Corrente: %d", super.numeroConta));
        System.out.println(String.format("Seu saldo da Conta Corrente é : R$ %.2f", super.saldo));
        System.out.println("=================================");
    }


}
