package ExerciciosPOO.SistemaTributario;

public class  ProdutoNacional implements Servico {

    @Override
    public double calcularImpostos(double valor, double taxaDeServico) {
        return valor + taxaDeServico;
    }
}
