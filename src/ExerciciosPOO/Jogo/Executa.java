package ExerciciosPOO.Jogo;

public class Executa {
    public static void main(String[] args) {
       Mago m1 = new Mago("Kira",5,"Mago");
       Arqueiro a1 = new Arqueiro("Louisis",4,"Arqueiro");
       Guerreiro g1 = new Guerreiro("Cris",7,"Guerreira");

       m1.atacar(a1);
       g1.atacar(a1);




    }
}
