package PessoaGafanhoto;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    private float experiencia;

    public Pessoa(float experiencia, int idade, String nome, String sexo) {
        this.experiencia = 0;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
    }

    public void ganharExperiencia(){
        setExperiencia(getExperiencia()+1);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String isSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(float experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Pessoa\n" +
                "Experiencia: " + experiencia +
                "\nNome: " + nome + '\'' +
                "\nIdade: " + idade +
                "\nSexo:" + sexo;
    }
}
