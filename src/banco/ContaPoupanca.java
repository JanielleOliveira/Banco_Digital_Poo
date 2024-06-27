package banco;

public class ContaPoupanca extends Conta {

    private double taxaRendimento;
    public ContaPoupanca(Cliente cliente, double taxaRendimento) {
        super(cliente);
        this.taxaRendimento = taxaRendimento;
    }
    public void aplicarTaxaRendimento(){
        saldo += saldo + taxaRendimento;
        registrarTransacao("Taxa de Rendimento", taxaRendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();

    }
}
