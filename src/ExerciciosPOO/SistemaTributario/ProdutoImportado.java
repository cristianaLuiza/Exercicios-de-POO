package ExerciciosPOO.SistemaTributario;

public class ProdutoImportado implements  Servico{
   @Override
    public double calcularImpostos(double valor, double taxaDeServicos){
       return valor + taxaDeServicos +((valor + taxaDeServicos) * 15/100);
   }


}
