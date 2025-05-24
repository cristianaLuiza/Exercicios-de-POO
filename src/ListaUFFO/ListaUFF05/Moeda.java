package ListaUFFO.ListaUFF05;

public class Moeda {
    private String nomeMoeda;
    private double valorConversao;

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public Moeda(String moeda) {
        this.nomeMoeda = moeda;

        if(this.nomeMoeda.equalsIgnoreCase("dolar")) {
            this.valorConversao = 2.25;
        } else if (this.nomeMoeda.equalsIgnoreCase("euro")) {
            this.valorConversao = 3.01;
        } else{
            throw new IllegalArgumentException("Moeda inválida"); // lança uma excessão/erro do tipo argumento inválido do que foi passado
        }

    }

    public double getValorConversao(){
        return valorConversao;
    }


    public String toString() {
        return "Moeda do Tipo: " + nomeMoeda;
    }
}
