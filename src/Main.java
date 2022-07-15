public class Main {
    public static void main(String[] args) {
        //Banco
        Banco banco = new Banco("DIO BANK");

        //Clientes
        Cliente cliente1 = new Cliente("Jackson");
        Cliente cliente2 = new Cliente("Maria");
        Cliente cliente3 = new Cliente("Ana");

        //Contas
        ContaCorrente cc1 = new ContaCorrente(cliente1);
        ContaCorrente cc2 = new ContaCorrente(cliente2);
        ContaPoupanca cp = new ContaPoupanca(cliente3);

        //Banco - Contas
        banco.addConta(cc1);
        banco.addConta(cc2);
        banco.addConta(cp);

        //Operações bancárias
        cc1.depositar(100);
        cc1.transferir(10,cp);

        //Extrato
        cc1.imprimirExtrato();
        cc2.imprimirExtrato();
        cp.imprimirExtrato();

        //Banco - clientes
        banco.imprimirContas();
    }
}
