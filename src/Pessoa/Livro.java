package Pessoa;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totalPagina;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    public String detalhes() {
        return "Livro \n" +
                "Titulo: " + titulo + '\'' +
                ", Autor " + autor + '\'' +
                ",\nTotal de Pagina: " + totalPagina +
                ", Pagina Atual: " + pagAtual +
                ",\nLivro aberto? " + aberto +
                ",\nleitor: " + leitor.getNome()+", "+
                leitor.getIdade()+" anos, sexo "+leitor.gets();
    }

    public Livro(String titulo, String autor, int totalPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPagina = totalPagina;
        this.aberto=false;
        this.pagAtual = 0;
        this.leitor = leitor;
    }

    private Pessoa getleitor() {
        return leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getTotalPagina() {
        return totalPagina;
    }

    public void setTotalPagina(int totalPagina) {
        this.totalPagina = totalPagina;
    }

    public boolean Aberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        if (aberto) {
            System.out.println("Livro Aberto");
        } else {
            System.out.println("Livro Fechado");
        }
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual++;
    }

    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
