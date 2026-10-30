public class Banco {
    ContaBancaria conta;

    void criarConta(String nome, int numero) {
        conta = new ContaBancaria();
        conta.titular = nome;
        conta.numero = numero;
        conta.saldo = 0;
        System.out.println("Conta criada com sucesso");
    }

    void mostrarConta() {
        System.out.println("Titular: " + conta.titular);
        System.out.println("Número: " + conta.numero);
        System.out.println("Saldo: R$: " + conta.saldo);
    }
}