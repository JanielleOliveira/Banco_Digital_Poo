package banco;

public class ContaCorrente extends Conta {

    private double taxaManutencao;

    public ContaCorrente(Cliente cliente, double taxaManutencao) {
        super(cliente);
        this.taxaManutencao = taxaManutencao;
    }

    public void aplicarTaxaManutencao() {
        if (saldo >= taxaManutencao) {
            saldo -= taxaManutencao;
        } else {
            System.out.println("Saldo insuficiente para aplicar a taxa de manutenção!");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

    }
}

