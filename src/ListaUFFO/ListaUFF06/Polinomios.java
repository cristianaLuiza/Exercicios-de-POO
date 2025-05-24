package ListaUFFO.ListaUFF06;

import java.util.ArrayList;
import java.util.List;

public class Polinomios {

    private double termoIndependente;
    private int grau; //define quantos coefientes(numeros que acompanha x) e raizes terei
    private List<Double> coeficientes;

    public Polinomios(int grau, List<Double> coeficientes, double termoIndependente) {
        this.grau = grau;
        this.coeficientes = coeficientes;
        this.termoIndependente = termoIndependente;
    }

    public Polinomios() { // contrutor com valores default/padrões zerados e vazio;
        this.grau = 0;
        this.coeficientes = new ArrayList<>();
        this.termoIndependente = 0;
    }

    public String toString() {
        String polinomio = "";
        for (int i = 0; i < grau; i++) {
            polinomio = polinomio + coeficientes.get(i) + "x ^" + (grau - i) + " + ";
        }
        polinomio = polinomio + termoIndependente;
        return polinomio;
    }

    public String soma(Polinomios polinomio) {
        List<Double> coeficientes = new ArrayList<>();
        if (grau == polinomio.getGrau()) {
            for (int i = 0; i < grau; i++) {
                double soma = coeficientes.get(i) + polinomio.getCoeficientes().get(i);
                coeficientes.add(soma);
            }
        } else {
            int maiorGrau = 0;
            if (grau > polinomio.getGrau()) {
                maiorGrau = grau;
            } else {
                maiorGrau = polinomio.getGrau();
            }

            for (int i = 0; i < maiorGrau; i++) {
                double somaResto = polinomio.getCoeficientes().get(i) + 0;
            }
        }

        double somaTermo = termoIndependente + polinomio.getTermoIndependente();
        Polinomios novoPolinomio = new Polinomios(grau, coeficientes, somaTermo);
        return novoPolinomio.toString();
    }


    public int getGrau() {
        return grau;
    }

    public List<Double> getCoeficientes() {
        return coeficientes;
    }

    public double getTermoIndependente() {
        return termoIndependente;
    }

}
