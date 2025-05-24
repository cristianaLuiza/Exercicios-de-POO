package ExerciciosPOO.pagamento;

public class PagamentoBoleto implements Pagamento {
    @Override
    public double realizarPagamento(double valor) {
        double taxa = 0.50;
        return valor - (valor * (taxa/100));
    }
}
