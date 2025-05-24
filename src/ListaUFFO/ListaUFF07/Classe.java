package ListaUFFO.ListaUFF07;

public abstract class Classe extends Filo {

    private String classe;

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + "Classe " + classe + "\n";

        //String obtendoDescricaoPai = super.obterDescricao();
        //return obetendoDescricaoPai = "classe" + classe;
    }

    public Classe(String especie) {
        super(especie);
        if (especie.equalsIgnoreCase("homo sapiens") || especie.equalsIgnoreCase("canis familiaris")) {
            this.classe = "Mamalia";
        } else if (especie.equalsIgnoreCase("mosca domestica")) {
            this.classe = "Insecto";
        } else {
            classe = null;
        }
    }
}
