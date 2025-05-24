package ExerciciosPOO.cadastroDeFuncionarios;

import java.util.ArrayList;
import java.util.List;

public class executa {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();
        listaFuncionarios.add(new FuncionarioCLT("Graucia", 1700));
        listaFuncionarios.add(new Estagiario("Cristiana", 1040));
        listaFuncionarios.add(new FuncionarioPj("Luis", 120,40));

        for(Funcionario  i : listaFuncionarios){ // for-each para cada funcionario da lista faça o seguinte
            System.out.println("Funcionario: "+ i.getNome());
            System.out.println("Salario: " + i.calcularSalario());
            System.out.println("-----------------------------");
        }

        for(int i=0; i< listaFuncionarios.size();i++){
            System.out.println("Funcionario: "+ listaFuncionarios.get(i).getNome());
            System.out.println("Salario: " + listaFuncionarios.get(i).calcularSalario());
            System.out.println("-----------------------------");
        }


    }
}
