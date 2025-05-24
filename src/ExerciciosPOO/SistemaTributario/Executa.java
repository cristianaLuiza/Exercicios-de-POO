package ExerciciosPOO.SistemaTributario;

public class Executa {
    public static void main(String[] args) {
        ProdutoNacional pn = new ProdutoNacional();
        ProdutoImportado pi = new ProdutoImportado();

        System.out.println("Taxa para produtos Nacionais: "+pn.calcularImpostos(15,5));
        System.out.println("Taxa para produtos Importados: "+ pi.calcularImpostos(15,5));
    }
}
