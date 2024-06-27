// Main.java

import banco.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marry", "000.000.123-00");
        Cliente cliente2 = new Cliente("Martin", "000.321.000-11");

        IConta contaCorrente = new ContaCorrente(cliente1, 10.50); // Manutenção R$10,50 ao Mês
        IConta contaPoupanca = new ContaPoupanca(cliente2, 0.50);// Rendimento de 0.50% ao mês

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);


        contaCorrente.depositar(1000);
        contaPoupanca.depositar(250);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        // Simular a passagem de meses
        System.out.println("=== APLICANDO TAXA DE MANUTENÇÃO E RENDIMENTO ===");
        banco.simularMeses(3);

        System.out.println("=== TRANSFERÊNCIAS ===");
        contaCorrente.transferir(500, contaPoupanca);

        System.out.println("Saldo Conta " + contaCorrente.getNumeroConta() + " após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta  " + contaPoupanca.getNumeroConta() + " após transferência: " + contaPoupanca.getSaldo());

        System.out.println("\n === HISTÓRICO DE TRANSAÇÕES CONTA CORRENTE ===");
        for (Transacao transacao : contaCorrente.getHistoricoTransacoes()) {
            System.out.println(transacao);
        }
        System.out.println("\n === HISTÓRICO DE TRANSAÇÕES CONTA POUPANÇA ===");
        for (Transacao transacao : contaPoupanca.getHistoricoTransacoes()) {
            System.out.println(transacao);
        }


    }
}
