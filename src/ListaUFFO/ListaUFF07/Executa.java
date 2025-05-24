package ListaUFFO.ListaUFF07;

import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
     Especie e = new Especie("homo sapiens");
        System.out.println(e.obterDescricao());
        System.out.println("*********************************");

        Especie e2 = new Especie("canis familiaris");
        System.out.println(e2.obterDescricao());
        System.out.println("*********************************");

        Especie e3 = new Especie("mosca domestica");
        System.out.println(e3.obterDescricao());
        System.out.println("*********************************");


        Especie e4 = new Especie("kira domestica");
        System.out.println(e3.obterDescricao());


    }
}
