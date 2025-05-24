package Lista40exercicios.Ex019;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Itens> itens = new ArrayList<>();;

    public void adicionarItem(Produto pegarProduto, int quantidade) {
        Itens i1 = new Itens(pegarProduto, quantidade);
        itens.add(i1);
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}










































