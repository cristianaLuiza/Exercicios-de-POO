package ExGunabara.AnimalSobrecarga;

public class Mamifero extends Animal {
    protected String corPelo;

    @Override
    public void emitirSom(){
        System.out.println("Som de mamífero");
    }

}
