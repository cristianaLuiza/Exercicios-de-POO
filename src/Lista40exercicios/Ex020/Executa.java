package Lista40exercicios.Ex020;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Executa {
    public static void main(String[] args) {
        System.out.println("LISTA TELEFÔNICA");
        Agenda a1 = new Agenda();
        a1.addContato("Kira",123);
        a1.addContato("Kiru",456);

        System.out.println(a1.toString());
        a1.buscar(123);


    }
}
