package banco;

public interface IConta {

    void transferir(double valor, IConta contaDestino);

    void depositar(double valor);

    void sacar(double valor);

    void imprimirExtrato();
}
