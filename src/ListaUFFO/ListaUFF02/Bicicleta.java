package ListaUFFO.ListaUFF02;

public class Bicicleta {
    private double velocidade = 0;
    private int marcha = 0;
    private double velocidadeMaxima = 0;

    public Bicicleta(double velocidade, int marcha, double velocidadeMaxima) {
        this.velocidade = velocidade;
        this.marcha = marcha;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double verificarMarcha(double velocidade) {
        if (getVelocidade() < 5 & getVelocidade() > 0) {
            marcha = 3;
        } else if (getVelocidade() > 5 & getVelocidade() < 10) {
            marcha = 2;
        } else {
            marcha = 1;
        }
        return marcha;
    }

    public double acelerar(int velocidade) {
        double velocidadeFinal = 0;
        velocidadeFinal = (velocidade + getVelocidade());
        if (velocidadeFinal > velocidadeMaxima) {
            System.out.println(" ERRO:");
            return getVelocidade();
        }
        setVelocidade(velocidadeFinal);
        return velocidadeFinal;
    }

    public double frear(int velocidade) {
        double valocidadeFinalFrear = 0;
        valocidadeFinalFrear = (getVelocidade() - velocidade);
        setVelocidade(valocidadeFinalFrear);
        return valocidadeFinalFrear;
    }

    public String imprimirEstado() {
        if (velocidade != 0) {
            return "Bicicleta em movimento, velocidade maxima " + velocidadeMaxima;

        } else {
            return "Bicicleta parada";
        }

    }

    public void velocidadeMaxima() {
        if (getVelocidade() > 30) {
            System.out.println(" Velocidade máxima");
        }
    }

    public String toString() {
        return "Velocidade: " + velocidade + "| Marcha: " + marcha + "| Velocidade Maxima: " + velocidadeMaxima;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
}

//Implemente uma classe Bicicleta para representar uma bicicleta. Toda bicicleta tem
//uma velocidade (atributo velocidade) e uma marcha (atributo marcha). Além disto, a
//bicicleta pode: acelerar (método acelerar), frear (método frear) e apresentar o seu
//estado atual (método imprimirEstados). Em sua construção a classe deve iniciar na
//marcha 0 (zero) e com velocidade 0 (zero).

//menor valocidade maior marcha