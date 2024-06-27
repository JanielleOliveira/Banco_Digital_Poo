// Classe principal que executa o programa de simulação de banco

import banco.*;

public class Main {
    public static void main(String[] args) {
        // Criação de clientes
        Cliente cliente1 = new Cliente("Marry", "000.000.123-00");
        Cliente cliente2 = new Cliente("Martin", "000.321.000-11");

        // Criação de contas corrente e poupança
        IConta contaCorrente = new ContaCorrente(cliente1, 10.50); // Manutenção R$10,50 ao Mês
        IConta contaPoupanca = new ContaPoupanca(cliente2, 0.50);// Rendimento de 0.50% ao mês

        // Criação do banco e adição das contas
        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);

        // Depósitos iniciais nas contas
        contaCorrente.depositar(1000);
        contaPoupanca.depositar(200);

        // Impressão dos extratos iniciais das contas
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        // Simulação da passagem de meses com aplicação de taxas e rendimentos
        System.out.println("=== APLICANDO TAXA DE MANUTENÇÃO E RENDIMENTO ===");
        banco.simularMeses(2);

        // Transferência entre contas
        System.out.println("=== TRANSFERÊNCIA ENTRE CONTAS ===");
        contaCorrente.transferir(500, contaPoupanca);

        // Exibição dos saldos após transferência
        System.out.println("Saldo Conta " + contaCorrente.getNumeroConta() + " após transferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta  " + contaPoupanca.getNumeroConta() + " após transferência: " + contaPoupanca.getSaldo());

        // Impressão do histórico de transações da conta corrente
        System.out.println("\n === HISTÓRICO DE TRANSAÇÕES CONTA CORRENTE ===");
        for (Transacao transacao : contaCorrente.getHistoricoTransacoes()) {
            System.out.println(transacao);
        }
        // Impressão do histórico de transações da conta poupança
        System.out.println("\n === HISTÓRICO DE TRANSAÇÕES CONTA POUPANÇA ===");
        for (Transacao transacao : contaPoupanca.getHistoricoTransacoes()) {
            System.out.println(transacao);
        }


    }
}
