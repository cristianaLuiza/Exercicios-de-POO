package Lista40exercicios.Ex019;

import java.util.List;

public class CarrinhoDeCompra {
    private Pedido pedido;
    private double precoTotal = 0;


    public CarrinhoDeCompra(Pedido pedido) {
        this.pedido = pedido;

    }

    public double pagarCarrinho(String formaPagamento, double valor) {
        List<Itens> itensDoCarrinho = pedido.getItens();
        for (int i = 0; i < itensDoCarrinho.size(); i++) {
            Itens itemDoCarrinho = itensDoCarrinho.get(i);
            double precoProduto = itemDoCarrinho.getProduto().getPreco();
            int quantidadeProduto = itemDoCarrinho.getQuantidade();
            precoTotal = precoTotal + (precoProduto * quantidadeProduto);
        }

        if (formaPagamento.equalsIgnoreCase("credito")) {
            precoTotal = (precoTotal * 0.20)+precoTotal;
        } else if (formaPagamento.equalsIgnoreCase("cheque")) {
            precoTotal = (precoTotal * 1.10)+precoTotal;
        } else if (formaPagamento.equalsIgnoreCase("dinheiro") ) {
            precoTotal = precoTotal * 1;
        }else {
            System.out.println("inválido");
        }

        double troco = 0;
        if (valor < precoTotal) {
            System.out.println("Valor inválido! ");
        } else {
            System.out.println("Compra realizado com sucesso!");
            troco = valor - precoTotal;
            System.out.println("Troco: " + troco);
        }
        return troco;
    }
    public String toString(){
        return "Valor total: " + precoTotal;
    }

}