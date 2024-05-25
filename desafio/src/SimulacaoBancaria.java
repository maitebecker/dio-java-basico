import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    saldo += valorDeposito;
                    System.out.printf("Saldo atual: %.2f", saldo);
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.printf("Digite o valor a ser sacado: ");
                    double valorSaque = scanner.nextDouble();
                    if(saldo >= valorSaque){
                      saldo -= valorSaque;
                      System.out.printf("Saldo atual: %.1f", saldo);
                    }else{
                      System.out.printf("Saldo insuficiente");
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                     System.out.printf("Saldo atual: %.1f", saldo);
                    break;
                case 0:
                    System.out.printf("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.printf("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}