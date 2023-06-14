import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o número da conta: ");
            int numeroConta = scanner.nextInt();

            System.out.println("Digite a agência: ");
            String agencia = scanner.next();

            System.out.println("Digite seu nome: ");
            String nomeCliente = scanner.next();

            System.out.println("Digite o saldo da conta: ");
            float saldo = scanner.nextFloat();


            System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco. Sua agência é "+agencia+", conta "+numeroConta+" e seu saldo de R$ "+saldo+" já está disponível.");
        }



        
    }
}
