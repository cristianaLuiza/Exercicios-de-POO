package ListaUFFO.ListaUFF08;

import java.util.ArrayList;
import java.util.List;

public class Casa extends Imovel {

    private Cor cor;
    private int portasEstaoAbertas;
    private Porta porta1, porta2, porta3;

    public Casa(Cor cor, Porta porta1, Porta porta2, Porta porta3) {
        this.cor = cor;
        this.porta1 = porta1;
        this.porta2 = porta2;
        this.porta3 = porta3;
    }

    public int totalDePortas() {
        return totalDePortas = 3;
    }


    public int quantasPortasEstaoAbertas() {
        if (porta1.getAberta()) {
            portasEstaoAbertas = portasEstaoAbertas + 1;
        }
        if (porta2.getAberta()) {
            portasEstaoAbertas = portasEstaoAbertas + 1;
        }
        if (porta3.getAberta()) {
            portasEstaoAbertas = portasEstaoAbertas + 1;
        }
        return portasEstaoAbertas;
    }

    public String toString() {
        return "Cor da casa " + cor + "\n" +
                "Quantidade de portas abertas " + quantasPortasEstaoAbertas() + "\n";
    }
}