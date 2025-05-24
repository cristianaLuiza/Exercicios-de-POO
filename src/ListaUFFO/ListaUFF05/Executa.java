package ListaUFFO.ListaUFF05;

import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ConversorMonetario c1 = new ConversorMonetario();


        System.out.println("Valor que deseja converter em reais: ");
        double valorInformado = leia.nextDouble();
        System.out.println("Tipo de moeda");
        String tipoMoeda = leia.next();

        Moeda moeda1 = new Moeda(tipoMoeda);

        Valor v1 = new Valor(valorInformado, moeda1);

        System.out.println(c1.converter(v1));

    }
}
