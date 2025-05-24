package ListaUFFO.ListaUFF09;

public class Executa {
    public static void main(String[] args) {

        Tabuleiro t1 = new Tabuleiro();
        t1.exibindoTabuleiro();
        t1.posicionarPecasA();
        t1.digitandoElementosA();
        System.out.println("****************VEZ DO SEGUNDO JOGADOR****************");
        t1.posicionarPecasB();
        t1.digitandoElementosB();
    }
}
