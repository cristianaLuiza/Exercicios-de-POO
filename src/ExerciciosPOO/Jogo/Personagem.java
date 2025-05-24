package ExerciciosPOO.Jogo;

public class Personagem {
    String nome;
    int vida;
    String tipoClsse;

    public Personagem(String nome, int vida, String tipoClsse) {
        this.nome = nome;
        this.vida = vida;
        this.tipoClsse = tipoClsse;
    }

    public void atacar(){
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getTipoClsse() {
        return tipoClsse;
    }

    public int getVida() {
        return vida;
    }
}
