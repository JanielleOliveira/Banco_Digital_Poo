package banco;

import java.util.Date;

public class Transacao {
    private Date data;
    private String tipo;
    private double valor;
    private double saldoAposTransacao;

    public Transacao(String tipo, double valor, double saldoAposTransacao) {
        this.data = new Date();
        this.tipo = tipo;
        this.valor = valor;
        this.saldoAposTransacao = saldoAposTransacao;
    }

    public Date getData() {
        return data;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public double getSaldoAposTransacao() {
        return saldoAposTransacao;
    }

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

