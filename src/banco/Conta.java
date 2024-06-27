package banco;

import java.util.ArrayList;
import java.util.List;

// Esta é uma classe abstrata que implementa a interface IConta e define as propriedades comuns a todas as contas bancárias.
public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected double saldo;
    protected int numeroConta;
    protected Cliente cliente;
    protected List<Transacao> historicoTransacoes;// Inicializa o histórico de transações como uma lista vazia

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0.0; // Saldo inicial é zero
        this.historicoTransacoes = new ArrayList<>();

    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        registrarTransacao("Depósito", valor);

    }

    @Override
    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            registrarTransacao("Saque", valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void transferir(double valor, IConta destino) {
        if (saldo >= valor) {
            this.sacar(valor);
            destino.depositar(valor);
            registrarTransacao("Transferência", valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }

    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public int getNumeroConta() {

        return numeroConta;
    }

    @Override
    public Cliente getCliente() {

        return cliente;
    }

    // Retorna o histórico de transações desta conta
    public List<Transacao> getHistoricoTransacoes() {

        return historicoTransacoes;
    }

    // Registra uma nova transação no histórico
    protected void registrarTransacao(String tipo, double valor) {
        Transacao transacao = new Transacao(tipo, valor, saldo);
        historicoTransacoes.add(transacao);
    }

    // Imprime informações comuns da conta (titular, agência, número da conta e saldo)
    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF:  %s", this.cliente.getCpf()));
        System.out.println(String.format("AGENCIA: %d", this.agencia));
        System.out.println(String.format("CONTA: %d", this.numeroConta));
        System.out.println(String.format("SALDO %.2f", this.saldo));
    }

}

