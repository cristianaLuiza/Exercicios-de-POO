package ExerciciosPOO.SistemaHospitalar;

public class Recepcionista extends FuncionarioHospitalar {
    private int ramal;

    public Recepcionista(int matricula, String nome, int ramal) {
        super(matricula, nome);
        this.ramal = ramal;
    }

    @Override
    public void atenderPaciente() {
        System.out.println("Atendimento realizado na recpção pelo ramal:" + getRamal());
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
