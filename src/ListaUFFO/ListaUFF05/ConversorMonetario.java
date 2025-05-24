package ListaUFFO.ListaUFF05;

public class ConversorMonetario {

    public double converter(Valor valor) {
        double valorConvertidoEmReais = 0;
        Moeda moeda = valor.getMoeda();
        if (moeda.getNomeMoeda().equalsIgnoreCase("dolar")) {
            valorConvertidoEmReais = valor.getValor() * moeda.getValorConversao();

        } else if (moeda.getNomeMoeda().equalsIgnoreCase("euro")) {
            valorConvertidoEmReais = valor.getValor() * moeda.getValorConversao();
        } else {
            throw new IllegalArgumentException("Moeda não existente");
        }
        return valorConvertidoEmReais;
    }
}