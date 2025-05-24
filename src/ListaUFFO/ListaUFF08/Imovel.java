package ListaUFFO.ListaUFF08;

import java.util.ArrayList;
import java.util.List;

public abstract class Imovel {
    int totalAbertas = 0;
    int totalDePortas = 0;
    int quantasPortasEstaoAbertas = 0;
    private List<Porta> portas = new ArrayList<>();


    public abstract int quantasPortasEstaoAbertas();

    public abstract int totalDePortas();

    public int getTotaldePortas() {
        return totalDePortas;
    }

}
