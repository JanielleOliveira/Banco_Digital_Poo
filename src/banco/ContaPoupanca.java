package banco;

// Representa uma conta poupança que estende a classe Conta
public class ContaPoupanca extends Conta {

    private double taxaRendimento;

    // Construtor da classe ContaPoupanca
    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }

    // Aplica a taxa de rendimento à conta poupança
    public void aplicarTaxaRendimento() {
        saldo += saldo + taxaRendimento;
        registrarTransacao("Taxa de Rendimento", taxaRendimento);
    }

    // Imprime o extrato da conta poupança
    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();

    }
}
