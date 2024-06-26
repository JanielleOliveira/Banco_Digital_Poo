package banco;

import java.util.ArrayList;
import java.util.List;

//Gerencia as contas, permitindo adicionar e buscar contas.

public class Banco {
    private final List<IConta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(IConta conta) {
        contas.add(conta);
    }

    public IConta buscarConta(int numeroConta) {
        for (IConta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

}
