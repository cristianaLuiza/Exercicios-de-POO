package ControleRemoto;

public class ExecutarControle {
    public static void main(String[] args) {
        ControleRemoto cr = new ControleRemoto();
        cr.ligar();
        cr.maisVolume();
        cr.play();
        cr.abrirMenu();
        cr.fecharMenu();
    }
}
