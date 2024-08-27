package MasterDev;

import java.util.Objects;

public class Pessoa {
    private Long id;
    private String nome;

    public Pessoa(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this.id == 0) return true;
        if (!(o instanceof Pessoa)) return false;
        Pessoa pessoa = (Pessoa) o;
        return this.id.equals(pessoa.id) && this.nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }
}
