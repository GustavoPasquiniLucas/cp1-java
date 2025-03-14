public class Main {
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);

        System.out.print("Nome do titular: ");
        String titular = s.nextLine();

        System.out.print("Saldo inicial: ");
        double saldoInicial = s.nextDouble();

        ContaBancaria conta = new ContaBancaria(titular, saldoInicial);

        while (true) {
            System.out.println("\nO que deseja fazer?");
            System.out.println("1 Depositar");
            System.out.println("2 Sacar");
            System.out.println("3 Consultar saldo");
            System.out.println("4 Alterar titular");
            System.out.println("5 Sair");
            System.out.print("👉 Escolha uma opção: ");

            int opcao = s.nextInt();

            if (opcao == 1) {
                System.out.print("Valor para depósito: ");
                conta.depositar(s.nextDouble());
            }
            else if (opcao == 2) {
                System.out.print("Valor para saque: ");
                conta.sacar(s.nextDouble());
            }
            else if (opcao == 3) {
                System.out.println("Saldo atual: R$ " + conta.consultarSaldo());
            }
            else if (opcao == 4) {
                s.nextLine();
                System.out.print("Novo titular: ");
                conta.setTitular(s.nextLine());
            }
            else if (opcao == 5) {
                System.out.println("Saindo... Obrigado por usar nosso sistema!");
                break;
            }
            else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        s.close();
    }
}
