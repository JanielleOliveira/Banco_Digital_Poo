// Main.java

import banco.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Marry", "000.000.123-00");
        Cliente cliente2 = new Cliente("Martin", "000.321.000-11");

        IConta contaCorrente = new ContaCorrente(cliente1);
        IConta contaPoupanca = new ContaPoupanca(cliente2);

        Banco banco = new Banco();
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPoupanca);


        contaCorrente.depositar(1000);
        contaPoupanca.depositar(250);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

        System.out.println("=== TRANSFERÊNCIAS ===");
        contaCorrente.transferir(500, contaPoupanca);

        System.out.println("Saldo Conta Corrente após tranferência: " + contaCorrente.getSaldo());
        System.out.println("Saldo Conta Poupança após tranferência: " + contaPoupanca.getSaldo());




    }
}
