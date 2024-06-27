package banco;

import java.util.ArrayList;
import java.util.List;

//Gerencia as contas e aplica as taxas e rendimentos.
public class Banco {
    private final List<IConta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    public void aplicarTaxaManutencao() {
        for (IConta conta : contas) {
            if (conta instanceof ContaCorrente) {
                ((ContaCorrente) conta).aplicarTaxaManutencao();
            }
        }
    }

    public void aplicarRendimentos() {
        for (IConta conta : contas) {
            if (conta instanceof ContaPoupanca) {
                ((ContaPoupanca) conta).aplicarTaxaRendimento();
            }
        }
    }

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
