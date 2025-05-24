package ExerciciosPOO.pagamento;

public class PagamentoPix implements Pagamento{
    @Override
    public double realizarPagamento(double valor) {
        double taxa = 5;
        return valor - (valor * (taxa/100)) ;
    }
}
