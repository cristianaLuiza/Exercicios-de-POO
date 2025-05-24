package ExerciciosPOO.Pergunta;

public class PerguntaMultipla implements Pergunta{
    private String enunciado;
    private String opcao;

    public String getEnunciado() {
        return "Qual meu mês preferido?";
    }

    public String getOpcao() {
        return "a)Julho\n" +
                "b)Agosto\n" +
                "c)Dezembro\n" +
                "d)Janeiro";
    }

    @Override
    public boolean responder(String resposta) {
        if(resposta.equalsIgnoreCase("c")){
            System.out.println( "RESPOSTA CORRETA!!!");
            return true;

        }
        System.out.println("RESPOSTA INCORRETA!!!");
        return false;
    }
}
