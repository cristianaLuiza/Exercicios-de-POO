package ExerciciosPOO.cadastroDeFuncionarios;

public class Estagiario extends Funcionario{

    private double bolsa;

    public Estagiario(String nome, double bolsa) {
        super(nome);
        this.bolsa = bolsa;
    }

    @Override
    public double calcularSalario() { //abstração
        return bolsa ;
    }
}
