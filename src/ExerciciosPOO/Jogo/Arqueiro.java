package ExerciciosPOO.Jogo;

public class Arqueiro extends Personagem {
    private int dano = 2;

    public Arqueiro(String nome, int vida, String tipoClasse) {
        super(nome, vida, tipoClasse);
    }

    public void atacar(Personagem personagem) {

        if (personagem.getVida() <= 0) {
            System.out.println(personagem.getTipoClsse()+" DEATH!!");
        } else {
            int vidaRestante = personagem.getVida() - dano;
            System.out.println("Arqueiro " + nome + " ataca com rajada de flexas!!");
            personagem.setVida(vidaRestante);
            System.out.println("Dano do ARQUEIRO " + dano);
            System.out.println("Vida restante do " + personagem.getTipoClsse() + " " + vidaRestante);
            if (personagem.getVida() <= 0) {
                System.out.println(personagem.getTipoClsse()+" DEATH!!");
            }
        }
    }
}
