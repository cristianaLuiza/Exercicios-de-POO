package ListaUFFO.ListaUFF07;

public abstract class Filo extends Reino {

    private String filo;

    @Override
    public String obterDescricao() {
        return super.obterDescricao() + "Filo " + filo + "\n";

//        String obtenadoDescricaoPai = super.obterDescricao();
//       return obtenadoDescricaoPai = "filo" + filo;
    }

    public Filo (String especie){
        super();
        if (especie.equalsIgnoreCase("homo sapiens") || especie.equalsIgnoreCase("canis familiaris")) {
            this.filo = "Chordata";
        } else if (especie.equalsIgnoreCase("mosca domestica")) {
            this.filo = "Artropoda";
        } else {
            filo = null;
        }
    }
}
