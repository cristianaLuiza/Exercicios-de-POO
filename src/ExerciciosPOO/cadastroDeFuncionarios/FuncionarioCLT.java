package ExerciciosPOO.cadastroDeFuncionarios;

public class FuncionarioCLT extends Funcionario{
    private double salarioMensal;

    public FuncionarioCLT( String nome, double salarioMensal){
        super(nome);
        this.salarioMensal=salarioMensal;
    }
    @Override
    public double calcularSalario() { //polimorfismo
        return salarioMensal;
    }
}
