package ExerciciosPOO.livro;

public class Executa {
    public static void main(String[] args) {
        Livro l2 = new Livro("Xugu", "Como ser um chato");

        Biblioteca b1 = new Biblioteca();

        Usuario u1 = b1.addUsuario("u1");

        b1.addLivro("Cristiana", "Como tentar");
        b1.addLivro("Kira", "Minha vida de barata");

        b1.emprestimoLivro("Como tentar", u1);
        b1.emprestimoLivro("Minha vida de barata", u1);

        System.out.print(b1.toString());
        b1.listarLivroEmprestados(u1);
    }
}
