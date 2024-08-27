package PessoaGafanhoto;

public class Gafanhoto extends Pessoa{
    private int login;
    private int totAssistindo;

    public Gafanhoto(float experiencia, int idade, String nome, String sexo) {
        super(experiencia, idade, nome, sexo);
        this.login = 123;
        this.totAssistindo = 0;
    }

    public void viuMaisUm(){
        setTotAssistindo(getTotAssistindo()+1);
    }

    public int getLogin() {
        return login;
    }

    public void setLogin(int login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return totAssistindo;
    }

    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }

    @Override
    public String toString() {
        return "Gafanhoto " + super.toString()+
                "\nLogin: " + login +
                "\nTotal Assistindo: " + totAssistindo;
    }
}

