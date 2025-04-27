package banco;

public class Main {
    public static void main(String[] args) {
        Cliente reacher = new Cliente();
        reacher.setNome("Reacher");

        Conta cc = new ContaCorrente(reacher);
        Conta poupanca = new ContaPoupanca(reacher);

        cc.depositar(1500);
        cc.transferir(100, poupanca);

        Transacao transacao = new Transacao(cc, poupanca, 200);
        transacao.realizarTransferencia();
        transacao.imprimirDetalhesDaTransferencia();

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
