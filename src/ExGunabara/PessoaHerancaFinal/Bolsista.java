package ExGunabara.PessoaHerancaFinal;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    public void pagaMesalidade(){
        System.out.println(this.getNome()+" é bolsista! Pagamento facilitado");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
