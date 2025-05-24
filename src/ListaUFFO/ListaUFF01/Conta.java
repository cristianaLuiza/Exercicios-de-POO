package ListaUFFO.ListaUFF01;

public class Conta {
    private int numeroConta;
    private double saldo;
    private boolean especial;
    private double renda;
    private double limite;

    public Conta(int numeroConta, double saldo, double renda, double limite, boolean especial) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.renda = renda;
        this.limite = limite;
        this.especial = especial;

    }

    public String toString() {
        return "NºConta: " + numeroConta +
                "\nSaldo: " + saldo + "\nRenda: " +
                renda + "\nLimite: " + limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean getEspecial() {
        return especial;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }


}
