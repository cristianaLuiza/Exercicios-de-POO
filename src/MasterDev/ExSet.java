package MasterDev;

import java.util.HashSet;
import java.util.Set;

public class ExSet {
    public static void main(String[] args) {
        Set<Pessoa> pessoa = new HashSet<>();
        Pessoa joao =  new Pessoa(10,"joão");
        pessoa.add(joao);

//       // for(Pessoa pessoa: pessoas){
//            System.out.println(pessoa.getNome());
//        }
//
//        System.out.println("-------------------");
//        pessoa.add(joao);
//
//        boolean adicionou = pessoa.add(new Pessoa(10,"joao"));
//        if(adicionou){
//            System.out.println("Adicionou");
//        }else{
//            System.out.println("Não Adicionou");
//        }
//        for(Pessoa pessoa: pessoas){
//            System.out.println(pessoa.getNome());
//        }
    }
}
