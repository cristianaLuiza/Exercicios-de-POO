package ContaBanco;

public class ExecutaContaBanco {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(1111);
        p1.setDono("Cris");
        p1.abrirConta("CC");


        ContaBanco p2=new ContaBanco();
        p2.setNumConta(222);
        p2.setDono("Luis");
        p2.abrirConta("CP");

        p1.depositar(0);
        p2.depositar(500);

        p1.sacar(50);
        p2.sacar(450);

        p1.fecharConta();


        p1.estadoAtual();
        p2.estadoAtual();
    }
}
