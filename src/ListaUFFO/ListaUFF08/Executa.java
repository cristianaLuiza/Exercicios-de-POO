package ListaUFFO.ListaUFF08;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class Executa {
    public static void main(String[] args) {

        Porta p1 = new Porta(false, Cor.AMARELA, 2, 1.20, 0.5);
        Porta p2 = new Porta(true, Cor.PRETA, 2, 1.20, 0.5);
        Porta p3 = new Porta(true, Cor.VERMELHA, 2, 1.20, 0.5);
        Porta p4 = new Porta(false, Cor.AZUL, 2.1, 1.21, 0.6);
        Porta p5 = new Porta(false, Cor.VERDE, 2.2, 1.22, 0.7);
        Porta p6 = new Porta(true, Cor.BRANCA, 2.3, 1.23, 0.8);

        p1.setAltura(2.20);
        System.out.println(p1.toString());
        System.out.println("****************");
        List<Porta> portasCasa = new ArrayList<>();

        Casa c1 = new Casa(Cor.BRANCA, p1, p2, p2);
        System.out.println(c1.toString());

        System.out.println("****************");

        List<Porta> portas = new ArrayList<>();
        Edificio e1 = new Edificio(Cor.PRETA, 3, 2, portas);

        e1.adicionarPorta(p1);
        e1.adicionarPorta(p2);
        e1.adicionarPorta(p3);
        e1.adicionarPorta(p4);
        e1.adicionarPorta(p5);
        e1.adicionarPorta(p6);

        p1.estaAberta();
        p3.abrirPorta();
        p4.fecharPorta();

        e1.addAndares();
        e1.getTotalDeAndares();

        System.out.println(e1.toString());


    }
}
