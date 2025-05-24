package ExerciciosPOO.Pergunta;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PerguntaDissertativa implements Pergunta {
    private String enunciado;

    public String getEnunciado() {
        return "Por que me apaixonei por você, site 3 caracteristicas?";
    }

    @Override
    public boolean responder(String respostaDissertativa) {
        String palavraChave = "lindo, gentil, engraçado";
        if (respostaDissertativa.contains(palavraChave)) {
            System.out.println("RESPOSTA CORRETA!!!!");
            return true;
        }
        System.out.println("RESPOSTA INCORRETA!!!!");
        return false;
    }
}
