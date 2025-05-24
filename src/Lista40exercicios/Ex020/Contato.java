package Lista40exercicios.Ex020;

public class Contato {
    String nome;
    int numero;

    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return
                "Nome:" + nome + '\'' +
                " Numero:" + numero +
                '|';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
