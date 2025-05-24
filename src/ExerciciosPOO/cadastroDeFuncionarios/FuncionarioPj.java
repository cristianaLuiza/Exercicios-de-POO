package ExerciciosPOO.cadastroDeFuncionarios;

import java.util.List;

public class FuncionarioPj extends  Funcionario{
private double valorHora;
private double horasTrabalhada;

public FuncionarioPj(String nome, double valorHora, double horasTrabalhada){
    super(nome);
   this.valorHora = valorHora;
   this.horasTrabalhada = horasTrabalhada;
}
    @Override
    public double calcularSalario() {
        return (valorHora*horasTrabalhada);
    }
}
