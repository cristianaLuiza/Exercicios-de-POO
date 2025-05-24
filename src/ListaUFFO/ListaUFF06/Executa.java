package ListaUFFO.ListaUFF06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Executa {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<Double> coeficientes = new ArrayList<>();
        System.out.println("Digite o grau");
        int grau = leia.nextInt();

        for (int i = 0; i < grau; i++) {
            System.out.println("Digite o coeficiente");
            coeficientes.add(leia.nextDouble());
        }

        System.out.println("Digite o termo independente");
        double termoIndependente = leia.nextDouble();

        Polinomios polinomio1 = new Polinomios(grau, coeficientes, termoIndependente);
        System.out.println(polinomio1);
//--------------------------------------------------------------------------------------//
        System.out.println("Digite o grau");
        grau = leia.nextInt();

        for (int i = 0; i < grau; i++) {
            System.out.println("Digite o coeficiente");
            coeficientes.add(leia.nextDouble());
        }

        System.out.println("Digite o termo independente");
        termoIndependente = leia.nextDouble();
        Polinomios polinomio2 = new Polinomios(grau, coeficientes, termoIndependente);
        System.out.println(polinomio2.soma(polinomio1));


    }

}
