package Animal;

public class ExecutarAnimal {
    public static void main(String[] args) {
        Mamifero m= new Mamifero();
        Reptil r =  new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

//        m.setPeso(35.5f);
//        m.setCorPelo("Marrom");
//        m.alimentar();
//        m.locomover();
//        m.emitirSom();
//        System.out.println("\n");
//        a.locomover();
//        a.alimentar();
//        a.emitirSom();

        Canguru c =  new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga ta = new Tartaruga();
        PeixeDourado pd = new PeixeDourado();
        Arara ar =  new Arara();

        c.locomover();
        c.emitirSom();
        ca.locomover();
        ca.emitirSom();
        ar.locomover();
        co.alimentar();





    }
}
