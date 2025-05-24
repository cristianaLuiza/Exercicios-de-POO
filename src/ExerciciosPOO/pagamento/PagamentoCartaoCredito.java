package ExerciciosPOO.pagamento;

public class PagamentoCartaoCredito implements Pagamento {
    @Override
    public double realizarPagamento(double valor) {
        double taxa = 1.80;
        return valor + (valor * (taxa/100)) ;
    }

}
