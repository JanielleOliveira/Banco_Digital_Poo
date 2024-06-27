package banco;

// Representa uma conta corrente que estende a classe Conta
public class ContaCorrente extends Conta {

    private double taxaManutencao;

    // Construtor da classe ContaCorrente
    public ContaCorrente(Cliente cliente, double taxaManutencao) {
        super(cliente);
        this.taxaManutencao = taxaManutencao;
    }

    // Aplica a taxa de manutenção à conta corrente
    public void aplicarTaxaManutencao() {
        if (saldo >= taxaManutencao) {
            saldo -= taxaManutencao;
            registrarTransacao("Taxa de Manutenção", taxaManutencao);
        } else {
            System.out.println("Saldo insuficiente para aplicar a taxa de manutenção!");
        }
    }

    // Imprime o extrato da conta corrente
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();

    }
}

