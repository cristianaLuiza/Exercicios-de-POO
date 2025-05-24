package ExerciciosPOO.pagamento;

public class Executa {
    public static void main(String[] args) {
        PagamentoCartaoCredito credito = new PagamentoCartaoCredito();
        PagamentoBoleto boleto = new PagamentoBoleto();
        PagamentoPix pix = new PagamentoPix();

        System.out.println("Taxa para Crédito: "+credito.realizarPagamento(20));
        System.out.println("Taxa para Boleto: "+boleto.realizarPagamento(15));
        System.out.println("Taxa para Pix: " + pix.realizarPagamento(10));
    }
}
