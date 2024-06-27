package banco;

import java.util.Date;

// Representa uma transação bancária com detalhes como tipo, valor, data e saldo após a transação
public class Transacao {
    private Date data;
    private String tipo;
    private double valor;
    private double saldoAposTransacao;

    // Construtor da classe Transacao
    public Transacao(String tipo, double valor, double saldoAposTransacao) {
        this.data = new Date();
        this.tipo = tipo;
        this.valor = valor;
        this.saldoAposTransacao = saldoAposTransacao;
    }

    // Retorna a data da transação
    public Date getData() {
        return data;
    }

    // Retorna o tipo da transação
    public String getTipo() {
        return tipo;
    }

    // Retorna o valor da transação
    public double getValor() {
        return valor;
    }

    // Retorna o saldo após a transação
    public double getSaldoAposTransacao() {
        return saldoAposTransacao;
    }

    // Representação em string da transação
    @Override
    public String toString() {
        return "Transacao{" +
                "data=" + data +
                ", tipo='" + tipo + '\'' +
                ", valor=" + valor +
                ", saldoAposTransacao=" + saldoAposTransacao +
                '}';
    }
}

