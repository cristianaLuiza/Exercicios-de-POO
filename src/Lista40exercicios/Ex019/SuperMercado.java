package Lista40exercicios.Ex019;

import java.util.ArrayList;
import java.util.List;

public class SuperMercado {
    private List<Produto> estoque;


    public SuperMercado() {

        Produto p1 = new Produto("Leite", 2, 6);
        Produto p2 = new Produto("queijo", 3, 9);
        Produto p3 = new Produto("Danone", 6, 12);

        estoque = new ArrayList<>();
        estoque.add(p1);
        estoque.add(p2);
        estoque.add(p3);
    }

    public Pedido criarPedido(String nomeBuscado, int quantidade) { //eu cliente digito o que eu quero e quantidade assim eu crio o meu pedido
        for (int i = 0; i < estoque.size(); i++) {
            Produto produtoEstoque = estoque.get(i);
            String nomeDoProduto = produtoEstoque.getNome();

            if (nomeDoProduto.equalsIgnoreCase(nomeBuscado)) {
                if (quantidade <= produtoEstoque.getEstoque()) {
                    Pedido p1 = new Pedido();
                    p1.adicionarItem(produtoEstoque, quantidade);//add um item ao meu pedido. O item é formado por um produto do estoque e um quantidade
                    return p1;
                } else {
                    System.out.println("Quantidade indisponível no estoque!");
                }
            } else {
                System.out.println("Nome não encontrado do produto!");
            }
        }
        if (estoque.isEmpty()) { // estoque vazio seria == 0
            System.out.println("Estoque vazio");
        }
        return null;
    }

    public Pedido atualizarPedido(Pedido pedido, String nomeBuscado, int quantidade){
        for (int i = 0; i < estoque.size(); i++) {
            Produto produtoEstoque = estoque.get(i);
            String nomeDoProduto = produtoEstoque.getNome();

            if (nomeDoProduto.equalsIgnoreCase(nomeBuscado)) {
                if (quantidade <= produtoEstoque.getEstoque()) {
                    pedido.adicionarItem(produtoEstoque, quantidade);//add um item ao meu pedido. O item é formado por um produto do estoque e um quantidade
                    return pedido;
                } else {
                    System.out.println("Quantidade indisponível no estoque!");
                }
            } else {
                System.out.println("Nome não encontrado do produto!");
            }
        }
        if (estoque.isEmpty()) { // estoque vazio seria == 0
            System.out.println("Estoque vazio");
        }
        return null;
    }
}
