package Animal;

public class Reptil extends Animal {

    private String cordaEscama;

    public String getCordaEscama() {
        return cordaEscama;
    }

    public void setCordaEscama(String cordaEscama) {
        this.cordaEscama = cordaEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de réptil");
    }
}
