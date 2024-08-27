package MasterDev;

import java.util.ArrayList;
import java.util.List;

public class ExLista {
    public static void main(String[] args) {
        List<Pessoa> pessoas =  new ArrayList<>();
        pessoas.add( new Pessoa(1,"Kira")); //Add pessoa
        Pessoa a = pessoas.get(0); // Recuperar um objeto dessa lista
        pessoas.remove(a); // remover o objeto, posso passar indice tb

        for(Pessoa pessoa: pessoas){ //para interagir com todos os objetos dessa lista
            System.out.println(pessoa.getNome());
        }
        System.out.println("---------------------------");
        pessoas.add(a); // add várias vezes o mesmo objeto

        for(Pessoa pessoa: pessoas){ //para interagir com todos os
            System.out.println(pessoa.getNome());
        }
    }
}


//OBS:Posso add o mesmo obj várias vezes