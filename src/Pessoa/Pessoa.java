package Pessoa;

public class Pessoa {
    private String nome;
    private int idade;
    private char s;

    public void apresentar(){
        System.out.println("Nome: "+getNome());
        System.out.println("Idade: "+getIdade());
        setS('f');
    }
    public Pessoa(String nome, int idade, char s){
        this.nome=nome;
        this.idade=idade;
        this.s=s;

    }

    public void aniversario() {
        this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char gets() {
        return s;
    }

    public void setS(char s) {
        if (s == 'f') {
            System.out.println("Femino");
        } else if (s == 'm') {
            System.out.println("Maculino");
        }
    }

}
