package Lista40exercicios.Ex019;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;


    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;

    }
    public int getEstoque(){
        return estoque;
    }

    public double getPreco() {
        return preco;
    }
}
