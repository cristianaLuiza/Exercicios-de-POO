package ListaUFFO.ListaUFF07;

public abstract class Ordem extends Classe {

    private String ordem;

    @Override  //sobrecrever comportamento
    public String obterDescricao() {
        return super.obterDescricao() + "Ordem " + ordem + "\n";  //juntando a classe pai
    }
    public Ordem (String especie){
        super(especie);
        if (especie.equalsIgnoreCase("homo sapiens")) {
            this.ordem = "Primata";
        } else if (especie.equalsIgnoreCase("canis familiaris")) {
            this.ordem = "Carnivora";
        } else if (especie.equalsIgnoreCase("mosca domestica")) {
            this.ordem = "Dípitera";
        } else {
            ordem = null;
        }

    }
}
