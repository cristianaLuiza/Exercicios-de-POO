package Pessoa;

public class ExecutaLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l= new Livro[3];

        p[0]=new Pessoa("Hórus",25,'m');
        p[1]=new Pessoa("Kira",15,'f');


        l[0]=new Livro("Cachorros","Cristiana",100,p[0]);
        l[1]= new Livro("Comportamento animal","Cristiana",150,p[1]);
        l[2]=new Livro("Animais","Cristiana",200,p[0]);
        l[0].abrir();
        l[0].folhear(20);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());


    }

}
