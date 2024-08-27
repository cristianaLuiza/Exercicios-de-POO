package AnimalSobrecarga;

public class Executar {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Passear");
        c.reagir("Fora");
        c.reagir(11, 45);
        c.reagir(21,00);
        c.reagir(true);
        c.reagir(false);
        c.reagir(2,14.5f);
        c.reagir(12,15.12f);
    }
}
