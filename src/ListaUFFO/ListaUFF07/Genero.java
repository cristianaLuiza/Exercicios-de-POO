package ListaUFFO.ListaUFF07;

public abstract class Genero extends Familia {

    private String genero;

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + "Genero " + genero+"\n";
    }

    public Genero(String especie) { // estou recebendo pela especie pq atraves dele eu filtro e acho meu genero
        super(especie);
        String[] inicioGenero = especie.split(" "); // quebrando a string em duas partes e devolvendo um array de strings com essas duas partes
        String genero = inicioGenero[0]; // selecionando o primeiro indice desse array,k ou seja a palavra home, inicial de especie
        this.genero = genero; // atribuindo o genero para o atributo da classe
    }
}
