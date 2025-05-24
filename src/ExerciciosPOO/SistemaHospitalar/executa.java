package ExerciciosPOO.SistemaHospitalar;

public class executa {
    public static void main(String[] args) {
        Enfermeiro e1 = new Enfermeiro(123,"cris","6 sus");
        Medico m1 = new Medico(456,"Luis","Ortopedia");
        Recepcionista r1 = new Recepcionista(789,"gra",123456);

        e1.atenderPaciente();
        m1.atenderPaciente();
        r1.atenderPaciente();
    }
}
