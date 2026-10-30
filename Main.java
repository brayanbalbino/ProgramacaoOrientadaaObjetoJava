import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        Banco banco = new Banco();

        System.out.println("=== PABLITO BANK ===");
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        System.out.println("Número da conta: ");
        int numero = entrada.nextInt();

        banco.criarConta(nome, numero);

        int opcao;
        do {
            System.out.println("\n1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Consultar saldo");
            System.out.println("4 - Mostrar conta");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            opcao = entrada.nextInt();

            switch (opcao) {
                case 1: {
                    System.out.print("Valor do depósito: ");
                    double valor = entrada.nextDouble();
                    banco.conta.depositar(valor);
                    break;
                }
                case 2: {
                    System.out.print("Valor do saque");
                    double valor = entrada.nextDouble();
                    banco.conta.sacar(valor);
                    break;
                }
                case 3: { banco.conta.consultarSaldo(); 
                    break; }
                case 4: { banco.mostrarConta(); 
                    break; }
                case 0: { System.out.println("Obrigado!"); 
                break; }
                default: { System.out.println("Opção inválida"); }
            } 
            
        } while (opcao != 0);
        entrada.close();
    }
}