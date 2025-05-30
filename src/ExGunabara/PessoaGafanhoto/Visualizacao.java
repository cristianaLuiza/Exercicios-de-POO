package ExGunabara.PessoaGafanhoto;

public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo()+1);
        this.filme.setViews(this.filme.getViews()+1);
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public void avaliar() {
        this.filme.setAvaliacoes(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacoes(nota);

    }
    public void avaliar(float porc){
        int tot = 0;
        if(porc<=20){
            tot = 3;
        }else if(porc<=50){
            tot=5;
        }else if(porc <=90){
            tot=8;
        }else{
            tot =10;
        }
        this.filme.setAvaliacoes(tot);
    }
    @Override
    public String toString() {
        return "Visualizacao\n" +
                "Espectador: " + espectador +
                "Filme: " + filme ;
    }
}
