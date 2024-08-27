package PessoaGafanhoto;

public class ProjetoYoutube {
    public static void main(String[] args) {

        Video v[] = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto(0f, 26, "Eu", "F");
        g[1] = new Gafanhoto(5f, 31, "xu", "M");

        Visualizacao vis[] = new Visualizacao[5];
         vis[0] = new Visualizacao(g[0], v[2]);
         vis[0].avaliar();
        System.out.println(vis[0].toString());


        vis[1]=new Visualizacao(g[0],v[1]);
        vis[0].avaliar(85.4f);
        System.out.println(vis[0].toString());
//
//        System.out.println("Videos____________");
//        System.out.println(v[0].toString());
//        System.out.println(v[1].toString());
//        System.out.println(v[2].toString());
//        System.out.println("\nGafanhotos");
//        System.out.println(g[0].toString());
//        System.out.println(g[1].toString());


    }
}