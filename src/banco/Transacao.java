package banco;
import java.time.LocalDateTime;

public class Transacao{
    private double valor;
    private Conta contaOrigem;
    private Conta contaDestino;
    private LocalDateTime dataTransacao;

    public Transacao(Conta contaOrigem, Conta contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.dataTransacao = LocalDateTime.now();
    }

    public void realizarTransferencia(){
        contaOrigem.transferir(valor, contaDestino);
    }

    public void imprimirDetalhesDaTransferencia(){
        System.out.println("=======Detalhes da Transação=======");
        System.out.println("Data da transação: " + dataTransacao);
        System.out.println("Valor: R$ " + String.format("%.2f", valor));
        System.out.println("De: " + contaOrigem.getNumero() + " para: " + contaDestino.getNumero());
    }
}