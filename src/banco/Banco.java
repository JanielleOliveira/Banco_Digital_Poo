package banco;

import java.util.ArrayList;
import java.util.List;

// Gerencia as contas e aplica as taxas e rendimentos.
public class Banco {
    private final List<IConta> contas;

    // Construtor do Banco, inicializa a lista de contas
    public Banco() {
        this.contas = new ArrayList<>();
    }

    // Adiciona uma nova conta ao banco
    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    // Aplica a taxa de manutenção a todas as contas correntes no banco
    public void aplicarTaxaManutencao() {
        for (IConta conta : contas) {
            if (conta instanceof ContaCorrente) {
                ((ContaCorrente) conta).aplicarTaxaManutencao();
            }
        }
    }

    // Aplica o rendimento a todas as contas poupança no banco
    public void aplicarRendimentos() {
        for (IConta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarTaxaRendimento();
            }
        }
    }

    // Simula a passagem de meses, aplicando taxas de manutenção e rendimentos
    public void simularMeses(int numeroMeses) {
        for (int i = 1; i <= numeroMeses; i++) {
            aplicarTaxaManutencao();
            aplicarRendimentos();
            System.out.println("Após " + i + " mês(es): ");
            for (IConta conta : contas) {
                System.out.println("Saldo da conta " + conta.getNumeroConta() + ": " + conta.getSaldo());
            }
        }
    }

}
