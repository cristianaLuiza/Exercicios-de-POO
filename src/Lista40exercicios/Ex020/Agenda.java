package Lista40exercicios.Ex020;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    ArrayList<Contato> listaContatos = new ArrayList<>();

    public void addContato(String nome, int numero) {
        Contato c1 = new Contato(nome, numero);
        listaContatos.add(c1);
    }

    public Contato buscar(int numero) {
        for (int i = 0; i < listaContatos.size(); i++) {
            Contato contatoLista = listaContatos.get(i);//Pega o contato atual da lista, na posição i, e guarda na variável contatoLista.
            int numeroContato = contatoLista.getNumero();//Armazena esse número na variável NumeroContato.
            if (numeroContato == numero) {
                System.out.println("NÚMERO DE CONTATO JÁ EXISTENTE");
                return contatoLista;
            } else {
                System.out.println("CONTATO NÃO ENCONTRADO");
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return
                "lista Contatos:" + listaContatos;
    }

    public ArrayList<Contato> getListaContatos() {
        return listaContatos;
    }

    public void setListaContatos(ArrayList<Contato> listaContatos) {
        this.listaContatos = listaContatos;
    }
}
