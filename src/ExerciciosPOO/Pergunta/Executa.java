package ExerciciosPOO.Pergunta;

import java.nio.CharBuffer;
import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        PerguntaSimples p1 = new PerguntaSimples();
        System.out.println(p1.getEnunciado());
        String respostaCurta = leia.nextLine();
        System.out.println(p1.responder(respostaCurta));

        System.out.println("---------------------------------");

        PerguntaDissertativa p2 = new PerguntaDissertativa();
        System.out.println(p2.getEnunciado());
        String respostaDissertativa = leia.nextLine();
        System.out.println(p2.responder(respostaDissertativa));

        System.out.println("----------------------------------");

        PerguntaMultipla p3 = new PerguntaMultipla();
        System.out.println(p3.getEnunciado()+"\n"+p3.getOpcao());
        String respostaMultipla = leia.nextLine();
        System.out.println(p3.responder(respostaMultipla));

    }
}
