package PessoaHerancaFinal;

public class Executar {
    public static void main(String[] args) {
//        Visitante v1= new Visitante();
//        v1.setNome("Juvenal");
//        v1.setIdade(22);
//        v1.setSexo("Maculino");
//        System.out.println(v1.toString());

        Aluno a1=new Aluno();
        a1.setNome("eu");
        a1.setMatricula(111);
        a1.setCurso("Computação");
        a1.setIdade(25);
        a1.setSexo("M");
        a1.pagarMensalidade();
        System.out.println(a1.toString());

        Bolsista b1 =  new Bolsista();
        b1.setNome("Kira");
        b1.setBolsa(12.50f);
        b1.setSexo("Masculino");
        System.out.println(b1.toString());
        b1.pagaMesalidade();

    }
}
