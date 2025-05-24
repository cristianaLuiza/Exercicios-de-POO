package ExerciciosPOO.SistemaHospitalar;

public class Medico extends FuncionarioHospitalar{
    private String especialidade;

    public Medico(int matricula, String nome, String especialidade) {
        super(matricula, nome);
        this.especialidade = especialidade;
    }

    @Override
    public void atenderPaciente(){
    System.out.println("Atendimento da especialidade de "+this.getEspecialidade() + " de clinica médica");
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
