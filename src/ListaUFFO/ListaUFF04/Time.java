package ListaUFFO.ListaUFF04;

import java.util.ArrayList;
import java.util.List;

public class Time {
    List<Jogador> listaJogadores = new ArrayList<>();

    public Jogador substituir(String nomeJogador, int numeroJogador) {
        for (int i = 0; i < listaJogadores.size(); i++) {
            Jogador substituirJogador = listaJogadores.get(i);
            if (substituirJogador.getNome().equals(nomeJogador)) {
                substituirJogador.setNome(nomeJogador);
                substituirJogador.setNumero(numeroJogador);

                return substituirJogador;
            }
        }
        return null;
    }

    public List<Jogador> consultarJogadores() {
        return listaJogadores;
    }

    public void preencherListaJogadores() {
        for (int i = 1; i <= 11; i++) {
            listaJogadores.add(new Jogador("kira"+ i , i));
        }

    }

    public String posicaoTatica(int numero) {
        if (numero == 1) {
            return "Goleiro";
        } else if (numero == 2 || numero == 3) {
            return "Zagueiro";
        } else if (numero == 4 || numero == 6) {
            return "Laterais";
        } else if (numero == 11) {
             return "Meio";
        } else if (numero == 7 || numero == 10) {
            return "Atacantes";
        } else {
            return "Camisa não encontrada";
        }

    }


}
