package ListaUFFO.ListaUFF07;

public abstract class Familia extends Ordem {

    private String familia;

    @Override   //sobrescrevendo o comportamento
    public String obterDescricao() {
        return super.obterDescricao() + "Familia " + familia + "\n";
    }

    public Familia(String especie) {
        super(especie);
        if (especie.equalsIgnoreCase("homo sapiens")) {
            this.familia = "Hominidea";
        } else if (especie.equalsIgnoreCase("canis familiaris")) {
            this.familia = "Canidea";
        } else if (especie.equalsIgnoreCase("mosca domestica")) {
            this.familia = "Mosquidea";
        } else {
            familia = null;
        }
    }
}


//fazer logica para poder analisara  a especie e ver qual a familia que será preenchida
//chamar o construtor da classe pai