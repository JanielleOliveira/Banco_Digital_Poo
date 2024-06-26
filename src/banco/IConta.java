package banco;

// Define os métodos que todas as contas devem implementar.

public interface IConta {
    void depositar(double valor);

    void sacar(double valor);

    void transferir(double valor, IConta destino);

    double getSaldo();

    int getNumeroConta();

    //Cliente getCliente();

    void imprimirExtrato();
}
