package ListaUFFO.ListaUFF05;

public class Valor {
    private double valor;
    private Moeda moeda;

    public double getValor() {
        return valor;

    }
    public Moeda getMoeda(){
        return moeda;
    }

    public Valor(double valor, Moeda moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }
}
