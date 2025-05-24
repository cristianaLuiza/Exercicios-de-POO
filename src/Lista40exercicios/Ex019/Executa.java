package Lista40exercicios.Ex019;

import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        SuperMercado s1 = new SuperMercado();
        String nome = "";
        int quantidade = 0;
        Pedido p1 = null;
        int opcao;

        do {
            System.out.println("Digite 0 para encerrar o programa: ");
            System.out.println("Digite 1 para adicionar mais produtos ");
            opcao = leia.nextInt();
            if (opcao == 1) {
                System.out.println("Digite o nome produto: ");
                nome = leia.next();
                System.out.println("Quantidade");
                quantidade = leia.nextInt();
                if(p1 == null){
                    p1 = s1.criarPedido(nome, quantidade);
                }else {
                    p1 = s1.atualizarPedido(p1,nome,quantidade);

                }
            }
        } while (opcao == 1);

        CarrinhoDeCompra c1 = new CarrinhoDeCompra(p1);
        c1.pagarCarrinho("dinheiro", 20);
        System.out.println(c1.toString());


    }
}