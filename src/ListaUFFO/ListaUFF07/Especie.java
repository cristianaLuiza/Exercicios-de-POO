package ListaUFFO.ListaUFF07;

public class Especie extends Genero {

    private String especie;

    @Override //sobrecrever o comportamnento
    public String obterDescricao() {
        String obtendoDescricaoPai = super.obterDescricao();//super palavra reservada para executar o comportamento da classe pai(genero)
        return obtendoDescricaoPai + "Especie " + especie; // juntando a classe pai com um comportamento especifico da classe especie

    }

    public Especie(String especie) {
        super(especie); // chamando o construtor da classe pai que é genero


        if (especie.equalsIgnoreCase("homo sapiens") ||
                especie.equalsIgnoreCase("canis familiaris") ||
                especie.equalsIgnoreCase("mosca domestica")) {
            this.especie = especie; //atribuindo um valor para variavél especie
        } else {
            throw new IllegalArgumentException("Especie não catalogada");
        }

    }


}
