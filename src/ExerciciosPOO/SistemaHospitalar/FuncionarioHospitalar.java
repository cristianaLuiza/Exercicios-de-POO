package ExerciciosPOO.SistemaHospitalar;

public abstract class FuncionarioHospitalar {

    private String nome;
    private int matricula;

    public FuncionarioHospitalar(int matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public abstract void atenderPaciente();
}
