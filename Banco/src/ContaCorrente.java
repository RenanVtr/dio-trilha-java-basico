public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("==== EXTRATO CONTA CORRENTE ====");
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Conta Corrente: %d", super.numeroConta));
        System.out.println(String.format("Seu saldo da Conta Corrente é : R$ %.2f", super.saldo));
        System.out.println("=================================");
    }


}
