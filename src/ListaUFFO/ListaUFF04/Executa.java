package ListaUFFO.ListaUFF04;

import java.util.ArrayList;
import java.util.List;

public class Executa {
    public static void main(String[] args) {
        Time time1 = new Time();

        String posicaoJogador = time1.posicaoTatica(2);
        time1.preencherListaJogadores();
        time1.substituir("kira1", 70);
        System.out.println(posicaoJogador);

        System.out.println(time1.consultarJogadores());


    }
}
