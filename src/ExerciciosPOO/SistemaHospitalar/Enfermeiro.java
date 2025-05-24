package ExerciciosPOO.SistemaHospitalar;

public class Enfermeiro extends FuncionarioHospitalar {
    private String setor;

    public Enfermeiro(int matricula, String nome, String setor) {
        super(matricula, nome);
        this.setor = setor;

    }
    @Override
    public void atenderPaciente() {
        System.out.println("Chamando setor do "+this.getSetor()+" da Enfermagem");
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }



}
