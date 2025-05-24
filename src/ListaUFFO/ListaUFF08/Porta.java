package ListaUFFO.ListaUFF08;

import java.util.List;

public class Porta{
    private Boolean aberta;
    private Cor cor;
    private double altura;
    private double largura;
    private double espessura;


    public Porta(Boolean aberta, Cor cor, double altura, double largura, double espessura) {
        this.aberta = aberta;
        this.cor = cor;
        this.altura = altura;
        this.largura = largura;
        this.espessura = espessura;
    }

    public void abrirPorta() {
        if (!aberta) {
            aberta = true;
        }
    }

    public void fecharPorta() {
        if (aberta) {
            aberta = false;
        }
    }

    public boolean estaAberta() {
        return true;
    }

    public String toString() {
        return "Porta aberta: " + aberta + "\n" +
                "Cor da porta: " + cor + "\n" +
                "Dimensões " + altura + "x" + largura + "x" + espessura + "\n"
                ;
    }


    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setEspessura(double espessura) {
        this.espessura = espessura;
    }
    public boolean getAberta(){
        return aberta;
    }


}
