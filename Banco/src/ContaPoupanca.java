public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO CONTA POUPANÇA ====");
        System.out.println(String.format("Olá %s !", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Conta Poupança: %d", super.numeroConta));
        System.out.println(String.format("Seu saldo da Conta Poupanca é : R$ %.2f", super.saldo));
        System.out.println("=================================");
    }

 
}
