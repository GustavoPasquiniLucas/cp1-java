public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void setTitular(String titular) {
        if (!titular.trim().isEmpty()) {
            this.titular = titular;
            System.out.println("Titular atualizado para: " + titular);
        } else {
            System.out.println("Nome inválido.");
        }
    }

    public String getTitular() {
        return titular;
    }
}
