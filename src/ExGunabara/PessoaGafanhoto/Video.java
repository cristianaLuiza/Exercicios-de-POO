package ExGunabara.PessoaGafanhoto;

public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacoes;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacoes = 1;
        this.curtidas = curtidas;
        this.reproduzindo = false;
        this.views = 0;
    }

    public int getAvaliacoes() {
        return avaliacoes;
    }

    public void setAvaliacoes(int avaliacoes) {
       int nova;
       nova = (int)((this.avaliacoes + avaliacoes)/this.views);
        this.avaliacoes = nova;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    @Override
    public void play() {
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        this.reproduzindo = false;
    }

    @Override
    public void like() {
    this.curtidas++;
    }

    @Override
    public String toString() {
        return "Video \n" +
                "Avaliações: " + avaliacoes +
                "\nTitulo:  " + titulo + '\'' +
                "\nViews: " + views +
                "\nCurtidas: " + curtidas +
                "\nReproduzindo " + reproduzindo;
    }
}
