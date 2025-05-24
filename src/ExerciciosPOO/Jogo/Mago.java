package ExerciciosPOO.Jogo;

public class Mago extends Personagem {
    public int dano = 3;

    public Mago(String nome, int vida, String tipoClasse) {
        super(nome, vida, tipoClasse);
    }

    public void atacar(Personagem personagem) {
        if (personagem.getVida() <= 0) {
            System.out.println(personagem.getTipoClsse()+" DEATH!!");
        } else {
            int vidaRestante = personagem.getVida() - dano;

            System.out.println("Mago " + nome + " ataca com poções mágicas!!");

            personagem.setVida(vidaRestante);
            System.out.println("Dano do MAGO " + dano);
            System.out.println("Vida restante do " + personagem.getTipoClsse() + " " + vidaRestante);
            if (personagem.getVida() <= 0) {
                System.out.println(personagem.getTipoClsse()+" DEATH!!");
            }
        }

    }
}
