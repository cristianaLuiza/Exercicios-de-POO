package ListaUFFO.ListaUFF04;

public class Jogador {
    public String nome;
    public int numero;

    public Jogador(String nome, int numero){
        this.nome = nome;
        this.numero = numero;
    }

    public String toString(){
        return "Nome Jogador: " +nome + " Numero da camisa: "+ numero;
    }

    public String getNome(){
        return nome;
    }
    public int getNumero(){
        return numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setNumero(int numero){
        this.numero = numero;
    }
}

