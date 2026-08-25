import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo inicial da conta: ");
        double saldo = scanner.nextDouble();

        int opcao;

        do {
            System.out.println("\n1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    if (valorDeposito > 0) {
                        saldo += valorDeposito;
                        System.out.println("Depósito realizado com sucesso.");
                    } else {
                        System.out.println("Valor inválido");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    if (valorSaque <= 0) {
                        System.out.println("Valor inválido");
                    } else if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= valorSaque;
                        System.out.println("Saque realizado com sucesso.");
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
