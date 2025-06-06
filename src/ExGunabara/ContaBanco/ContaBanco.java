package ExGunabara.ContaBanco;

public class ContaBanco {
    //ATRIBUTOS
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //MÉTODOS PERSONALIZADOS
    public void estadoAtual(){
        System.out.println("------------------------");
        System.out.println("Conta: "+this.numConta);
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("Conta não pode ser fechado por que tem saldo ");
        } else if (this.getSaldo() < 0) {
            System.out.println("Essa conta não pode ser fechada pois ainda tem débito");
        } else {
            this.setStatus(false);
            System.out.println("Sua conta foi fechada");
        }

    }

    public void depositar(float v) {
        if (this.getStatus()) {
            //this.saldo=this.saldo+v; outro modo de fazer
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado na conta de " + this.getDono());
        } else {
            System.out.println("Impossivel depositar em uma conta fechada!");
        }
    }

    public void sacar(float v) {
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque feito na conta de "+getDono());
            } else {
                System.out.println("Saldo insuficiente para saque");
            }
        } else {
            System.out.println("Impossivel sacar de uma conta fechada!");
        }

    }

    public void pagarMensal() {
        int v = 0;
        if (this.getTipo() == "CC") {
            v = 12;
        } else if (this.getTipo() == "CP") {
            v = 20;
        }//TODO POR ELSE
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga");
        } else {
            System.out.println("Impossivél pagar uma conta fechada");
        }
    }

   //METODO CONSTRUTOR
    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    //METODOS ESPECIAIS
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}