package ExerciciosPOO.livro;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> listaLivros = new ArrayList<>();
    private List<Usuario> listaUsuarios = new ArrayList<>();

    public void addLivro(String autor, String nomeLivro) {
        Livro l1 = new Livro(autor, nomeLivro);
        listaLivros.add(l1);
    }

    public Usuario addUsuario(String nomeUsuario){
        Usuario usuario1 = new Usuario(nomeUsuario);
        if(!listaUsuarios.contains(usuario1)){
            listaUsuarios.add(usuario1);
        }
        return usuario1;
    }

    public int emprestimoLivro(String nomeBuscadoLivro, Usuario usuario) {
        for (int i = 0; i < listaLivros.size(); i++) {
            Livro livroLista = listaLivros.get(i);
            String livroArmazenado = livroLista.getNomeLivro();
            if (livroArmazenado.equalsIgnoreCase(nomeBuscadoLivro)) {
                listaLivros.remove(livroLista);
                List<Livro>listaLivrosUsuario= usuario.getListaLivros() ;
                listaLivrosUsuario.add(livroLista);
                usuario.setListaLivros(listaLivrosUsuario);

                System.out.println("LIVRO EMPRESTADO");
            }
        }
        return 0;
    }

    public int devolucaoLivro(String nomeLivro) {
        for (int i = 0; i < listaLivros.size(); i++) {
            Livro livroLista = listaLivros.get(i);
            String livroArmazenado = livroLista.getNomeLivro();
            if (livroArmazenado.equalsIgnoreCase(nomeLivro)) {
                listaLivros.add(livroLista);
                System.out.println("LIVRO DEVOLVIDO");
            }
        }
        return 0;
    }

    public void listarLivroEmprestados(Usuario usuario) {
        if (listaUsuarios.contains(usuario)) {
            List<Livro> livrosEmprestados = usuario.getListaLivros();
            System.out.println("Usuário: " + usuario.getNomeUsuario() + " Teve esses livros emprestados: " +
                    livrosEmprestados);
        }
    }

    @Override
    public String toString() {
        return "Biblioteca" +
                " lista de Livros:" + listaLivros +"\n";
    }
}
