package ExerciciosPOO.Pergunta;

public class PerguntaSimples  implements Pergunta{
    private String enunciado;

    public String getEnunciado() {
        return "Minha cor preferida?";

    }

    @Override
    public boolean responder(String respostaCurta) {
        if (respostaCurta.equalsIgnoreCase("rosa")) {
            System.out.println("RESPOSTA CORRETA!!!");
            return true;
        }
        System.out.println("REPOSTA INCORRETA!!!");
        return false;
    }
}
