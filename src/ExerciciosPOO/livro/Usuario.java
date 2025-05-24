package ExerciciosPOO.livro;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Usuario {
    private String nomeUsuario;
    private List<Livro> listaLivros = new ArrayList<>();

    public Usuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public List<Livro> getListaLivros() {
        return listaLivros;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setListaLivros(List<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

}
