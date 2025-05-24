package ListaUFFO.ListaUFF08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Edificio extends Imovel {
    private Cor cor;
    private int totalDePortasAndar;
    private int totalDePortas;
    private int totalDeAndares = 0;
    private List<Porta> portas = new ArrayList<>();
    ;

    public Edificio(Cor cor, int totalDePortasAndar, int totalDeAndares, List<Porta> portas) {
        this.cor = cor;
        this.totalDePortasAndar = totalDePortasAndar;
        this.totalDeAndares = totalDeAndares;

    }
    public int quantasPortasEstaoAbertas() {
        for (int i = 0; i < portas.size(); i++) {
            Porta porta = portas.get(i);
            boolean portaAberta = porta.estaAberta();
            if (portaAberta == true) {
                quantasPortasEstaoAbertas = quantasPortasEstaoAbertas + 1;
            }
        }
        return quantasPortasEstaoAbertas;
    }

    public int totalDePortas() {
        return totalDePortas = this.totalDeAndares * this.totalDePortasAndar;
    }


    public void addAndares() {
        totalDeAndares = totalDeAndares + 1;
    }

    public void adicionarPorta(Porta p) {
        this.portas.add(p);
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public String toString() {
        return "Cor do edificio " + cor + "\n" +
                "Quantidade de portas abertas " + quantasPortasEstaoAbertas() + "\n" +
                "Total de portas " + totalDePortas() + "\n" +
                "Total de andares " + totalDeAndares + "\n"
               ;

    }


}
