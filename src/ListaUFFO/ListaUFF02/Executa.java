package ListaUFFO.ListaUFF02;

public class Executa {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta(5,2,15);

        b1.acelerar(36);
        b1.frear(2);


        System.out.println(b1);
        System.out.println("Sua bicicleta está em movimento? "+ b1.imprimirEstado());
        System.out.println("Sua bicicleta está com marcha: " +b1.verificarMarcha(5));
    }
}
