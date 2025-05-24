package ExerciciosPOO.cadastroDeFuncionarios;

import java.util.ArrayList;
import java.util.List;

public abstract class Funcionario {
    private String nome;

    public Funcionario(String nome) { //construtor padrão sem parâmetros
        this.nome=nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}
