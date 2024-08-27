package Lutador;

public class ExecutaLuta {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];

        l[0] = new Lutador("Xuxis", "Brasileiro", 30,
                1.70f, 71.50f, 11, 1, 3);

        l[1] = new Lutador("Oreo", "Mexicano", 29,
                1.65f, 68.56f, 10, 0, 4);

        l[2] = new Lutador("Kira", "Russa", 28,
                1.64f, 98.56f, 19, 5, 2);

        l[3] = new Lutador("Mabel", "Chile", 24,
                1.70f, 71.56f, 1, 1, 0);

        l[4] = new Lutador("Pandora", "Japão", 35,
                1.78f, 85.56f, 16, 3, 4);

        l[5] = new Lutador("Meg", "Mangolia", 20,
                1.65f, 78.56f, 5, 4, 0);


        Luta ufc1 = new Luta();
        ufc1.marcarLuta(l[5], l[1]);
        ufc1.lutar();


    }
}
