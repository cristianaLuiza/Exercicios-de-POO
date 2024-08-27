package PessoaHeranca;

public class ExecutarPessoa {
    public static void main(String[] args) {
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor  p3 = new Professor();
    Funcionario p4 = new Funcionario();

    p1.setNome("Cris");
    p2.setNome("Hórus");
    p3.setNome("Xubis");
    p4.setNome("Kira");

    p2.setSexo("Masculino");
    p1.setSexo("Feminino");

    p4.setIdade(6);
    p1.setIdade(32);

    p2.setCurso("Computação");
    p3.setSalario(4500.75f);
    p4.setSetor("Estoque");



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());


    }
}
