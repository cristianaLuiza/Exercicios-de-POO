package ExerciciosPOO.livro;

public class Livro {
    private String nomeLivro;
    private String autor;


    public Livro(String autor, String nomeLivro) {
        this.autor = autor;
        this.nomeLivro = nomeLivro;

    }

    @Override
    public String toString() {
        return
                "Autor:" + autor + '\'' +
                ", nome do Livro:" + nomeLivro + '\'' ;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

}
