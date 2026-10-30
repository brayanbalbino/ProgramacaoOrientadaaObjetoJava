public class ContaBancaria {
    String titular;
    int numero;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito realizado");
    }

    void sacar(Double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realiazado!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    void consultarSaldo() {
        System.out.println("Saldo: R$" + saldo);
    }
}