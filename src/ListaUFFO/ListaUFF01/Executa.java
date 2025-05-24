package ListaUFFO.ListaUFF01;

public class Executa {
    public static void main(String[] args) {

        Banco banco1 = new Banco();
        Conta conta1 = banco1.criarConta(123, 1500, 4000); // salvando o retorno
        Conta conta2 = banco1.criarConta(456, 2500, 5000);

        Banco banco2 = new Banco();
        Conta conta3 = banco2.criarConta(789, 3500, 1000);
        Conta conta4 = banco2.criarConta(1011, 4500, 6000);



        banco1.excluirConta(789);
        banco1.sacarDinheiro(conta1, 50);
        banco1.depositarDinheiro(conta1, 10);



        System.out.println(conta1 + "\n************\n" + conta2);
        System.out.println("Sua conta é especia? " + banco1.verificarContaEspecial(conta1));
        System.out.println(banco2.verificarSaldo(conta4));


    }
}
