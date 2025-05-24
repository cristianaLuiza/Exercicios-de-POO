package ExerciciosPOO.Jogo;

public class Guerreiro extends Personagem {
    private int dano = 1;

    public Guerreiro(String nome, int vida, String tipoClasse) {
        super(nome, vida, tipoClasse);
    }

    public void atacar(Personagem personagem) {

        if (personagem.getVida() <= 0) {
            System.out.println(personagem.getTipoClsse()+" DEATH!!");
        } else {
            int vidaRestante = personagem.getVida() - dano;
            System.out.println("Guerreiro " + nome + " ataca com suas espadas!!");
            personagem.setVida(vidaRestante);
            System.out.println("Dano do GUERREIRO " + dano);
            System.out.println("Vida restante do " + personagem.getTipoClsse() + " " + vidaRestante);
            if (personagem.getVida() <= 0) {
                System.out.println(personagem.getTipoClsse()+" DEATH!!");
            }
        }

    }
}
